<?php
   
    $dept_name = $_GET["dept"];
    $query = "select ename from department,employee where employee.dept_no = department.dept_no and dept_name = '$dept_name' ";



    $db = pg_connect("host=localhost user=postgres dbname=emp_dept");
    $result = pg_query($db,$query);

    echo "<table>";
    
    while( $row = pg_fetch_assoc($result) ){

        echo "<tr> <th>";
        echo $row['ename'];
        echo "</th> </tr>";
    }

    echo "</table>";


?>
