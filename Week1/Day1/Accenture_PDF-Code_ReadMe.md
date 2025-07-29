This program reads a full name as input and prints a shortened form using initials.  
It follows this format:

- For **2-part names**: First initial + dot + Last name  
  Example: `John Doe` → `J.Doe`

- For **3-part names**: First initial + dot + Middle initial + dot + Last name  
  Example: `John Michael Doe` → `J.M.Doe`

FUNCTION main:
    READ input_string
    CALL initialName(input_string)

FUNCTION initialName(string s):
    SPLIT s by spaces into array arr

    IF length of arr is 2 THEN:
        SET first_initial = first character of arr[0]
        SET last_name = arr[1]
        PRINT first_initial + "." + last_name

    ELSE IF length of arr is 3 THEN:
        SET first_initial = first character of arr[0]
        SET middle_initial = first character of arr[1]
        SET last_name = arr[2]
        PRINT first_initial + "." + middle_initial + "." + last_name
