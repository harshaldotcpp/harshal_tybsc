<?php

    $str1 = $_GET['str1'];
    $str2 = $_GET['str2'];



    function stropr($large,$small){
        echo "First Occurance of $small in $large is at ".strpos($large,$small);
        echo "<br>Last Occurance of $small in $large is at  ".strrpos($large,$small);
        echo "<br>Result Of Comparison ".strncasecmp($large,$small,5);
        
        if(strpos($large,$small) == 0 ){
            echo "<br>$small is the bigenning of  $large <br>";
        }
        else{
            echo "$small is not at the bigenning of $large <br>";
        }

    }


    if(strlen($str1) > strlen($str2)){
       stropr($str1,$str2);
    }
    else if(strlen($str1) < strlen($str2)){
       stropr($str2,$str1);
    }

?>
