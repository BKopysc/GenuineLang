#!/bin/bash

# run make, if error than stop
make clean || exit 1
make clean-tests || exit 1
make prepare-for-tests || exit 1

folder="./prepared-tests"
ANTLR=./antlr-4.13.0-complete.jar

# collect logs
final_logs="----- Logs from lli: \n"

# Iterate over files with extension ".gl"
for file in "$folder"/*.gl; do
    filename=$(basename "$file" .gl)

    process_log="\nProcessing file: $filename.gl"
    final_logs="$final_logs$process_log"

    echo "$process_log"
    
    full_path_file="$folder/$filename.gl"
    full_path_tests="$folder/$filename.ll"

    java -cp "$ANTLR":output:. Main "$full_path_file" > "$full_path_tests"

    #check if full_path_tests exists
    if [ ! -f "$full_path_tests" ]; then
        continue
    fi

    #check if full_path_tests is empty than continue loop
    if [ ! -s "$full_path_tests" ]; then
        continue
    fi

    #capture output from lli
    output_lli=$(lli "$full_path_tests")
    
    echo "$output_lli"
    final_logs="$final_logs\n$output_lli"
done

#save final_logs to file
echo "$final_logs" > "tests-logs.txt"