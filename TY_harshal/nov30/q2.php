<?php

    $temperatures = range(21,21+30);
    $temp_sum = 0;
    $temp_length = count($temperatures);

    echo "total temperature values are $temp_length <br>";
    foreach($temperatures as $temp)
        $temp_sum += $temp;

    $avg_temperature = $temp_sum / $temp_length;

    echo "Average temperatue is $avg_temperature <br>";

    sort($temperatures);

    echo "five lowest temperature: <br>";
    $lowest = array_slice($temperatures,0,5);
    foreach($lowest as $low_temp)
        echo "$low_temp ";
    echo "<br>";
    echo "five highest  temperature: <br>";
    $highest = array_slice($temperatures,$temp_length - 5,$temp_length);
    foreach($highest as $low_temp)
        echo "$low_temp ";
    echo "<br>";

?>
