<?php

    $str = $_GET['str'];
    $sep = $_GET['seperator'];
    $ch = $_GET['ch'];


    switch($ch){
        case 1: echo "spill the string $str <br> <br>";
            if($sep == "*"){
                $res = explode($sep,$str);
                print_r($res);
            }
            else if($sep == "@"){
                $res = explode($sep,$str);
                print_r($res);
            }
            else if($sep == "/"){
                $res = explode($sep,$str);
                print_r($res);
            }
            else if($sep == "-"){
                $res = explode($sep,$str);
                print_r($res);
            }
            break;
        case 2: echo "Replace $str <br>";
            echo str_replace($sep," ",$str);
            break;
        case 3: echo "last world of string <br>";
            $arr = explode($sep,$str);
            $last_word = $arr[count($arr)-1];
            echo "$last_word";
            break;
            
    }
?>
