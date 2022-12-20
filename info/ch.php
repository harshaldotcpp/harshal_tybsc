<?php
   $choice = $_POST["choice"];

   switch($choice){
      case "cricket":
       header("Location: http://localhost/info/cricket.html");
       exit();
      case "football":
       header("Location: http://localhost/info/football.html");
       exit();
      case "kabaddi":
       header("Location: http://localhost/info/football.html");
       exit();
      case "gym":
       header("Location: http://localhost/info/gym.html");
       exit();
   }
   }
   exit();
?>
