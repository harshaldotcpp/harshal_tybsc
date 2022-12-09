<?php
   $operation = $_GET["operation"];
    $value = $_GET["value"];
    $arr = range(0,10);


    switch($operation){
        case "push":
           array_push($arr,$value); 
            break;
        case "enqueue":
            array_unshift($arr,$value);
            break;
        case "pop":
            array_pop($arr);
            break;
        case "dequeue":
            array_shift($arr);
            break;
    }

    foreach($arr as $value)
        echo "$value ";

?>
