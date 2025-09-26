# Java-Program-for-file-format-conversion

# JSONtoCSV Converter

## Description
This project is a Java application that converts JSON files into CSV format.  
It is designed for simple JSON structures and **does not support nested objects**.  

- Input: JSON file with a list of objects.  
- Output: CSV file with headers and rows matching the JSON keys and values.  

Version: **1.0.0**  
Author: **Jafet Morales (NAO ID: 3357)**  

---

## Requirements
- Java **17** or higher  
- Maven **3.6+**  
- Dependencies (automatically handled by Maven):
  - `jackson-databind`
  - `jackson-dataformat-csv`
  - `junit-jupiter-api` (for testing) **not used in this version**

---

## Project Structure

JSONtoCSV/
│── Input Files/ **Place your input JSON files here**
│── Output Files/ **Generated CSV files will be stored here**
│── src/
│ └── main/
│ └── java/org/example/
│ ├── MainConverter.java **Entry point - handles user input/output**
│ ├── ReadJson.java **Reads and parses JSON file**
│ └── WriteCsv.java **Writes parsed data into CSV**
│── pom.xml **Maven configuration file**


## Usage
1. When prompted, enter the **path to your JSON file** (e.g., `Input Files/sample.json`).
2. Enter the **path for the CSV output file** (e.g., `Output Files/output.csv`).
3. If the file is valid, the program will generate a CSV file.

**Example run:**
```bash
===WELCOME TO THE JSON-TO-CSV CONVERTER===
Insert your JSON file's FilePath: Input Files/data.json
Insert the FilePath for your CSV file: Output Files/result.csv
SUCCESFUL CONVERSION: Check your output filepath!