# Instructions  

## PRACTICUM 7 - Fahrenheit to Celsius Program<br>

### BACKGROUND
**Temperature Conversion Formula**<br>
The formula for converting Fahrenheit to Celsius is:
`C = (F − 32) × 5/9`.<br><br>
**Formatted Output**<br>
In order to display a floating-point value with one decimal
place of accuracy can use,<br>
(assuming that the fahrenheit value is in variable `fahren`
and the celsius value is in variable `celsius`),<br><br>
`System.out.printf("%d degrees Fahrenheit = %.1f degrees Celsius", fahren, celsius);`<br><br>
The `%d` is a *format specifier* and placeholder for the display of an integer value,
and `%.1f` is a placeholder for displayinjg a floating-point
values rounded to one decimal place. The two variables
following the first comma contains the values to be used
(the value of variable fahren displayed using format specifier `%d` and the
value of variable celsius is displayed using format specifier `%.1f`)

### WHAT TO DO
- `Develop a program` that converts Fahrenheit to Celsius using the Celsius to Fahrenheit program of Practicum 6 as a model.<br><br>
- The program output must be exactly as follows:<br>
`212 Fahrenheit = 100.0 degrees Celsius` <br><br>rounded to one
decimal place.<br><br>
- `Run the predefined tests` (click the Tests icon in the left column under Tools) and correct any remaining logic errors.
