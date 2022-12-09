<?php

    $code = $_GET["code"];
    $name = $_GET["name"];
    $unit  = $_GET["unit"];
    $rate = $_GET["rate"];

    $code_arr = explode(",",$code);
    $name_arr = explode(",",$name);
    $unit_arr  = explode(",",$unit);
    $rate_arr = explode(",",$rate);
        

    echo "bill in Tabular form: <br>";
    echo "<table border=2>";
    echo "<tr> <td>code</td> <td>name</td> <td>unit</td> <td>rate</td><td>total</td></tr>"; 
    echo "<tr> <td>$code_arr[0]</td> <td>$name_arr[0]</td> <td>$unit_arr[0]</td> <td>$rate_arr[0]</td><td>".$unit_arr[0]*$rate_arr[0]."</td></tr>"; 
    echo "<tr> <td>$code_arr[1]</td> <td>$name_arr[1]</td> <td>$unit_arr[1]</td> <td>$rate_arr[1]</td><td>".$unit_arr[1]*$rate_arr[1]."</td></tr>"; 
    echo "<tr> <td>$code_arr[2]</td> <td>$name_arr[2]</td> <td>$unit_arr[2]</td> <td>$rate_arr[2]</td><td>".$unit_arr[2]*$rate_arr[2]."</td></tr>"; 
    echo "<tr> <td>$code_arr[3]</td> <td>$name_arr[3]</td> <td>$unit_arr[3]</td> <td>$rate_arr[3]</td><td>".$unit_arr[3]*$rate_arr[3]."</td></tr>"; 
    echo "</table>";
    
?>

