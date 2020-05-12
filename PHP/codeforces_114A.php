<!-- https://codeforces.com/problemset/problem/114/A -->
<?php
    $k = (int)readline();
    $l = (int)readline();
    $x = $k;
    $counter = 0;
    while($x < $l){
        $x *= $k;
        $counter ++;
    }
    if($x == $l){
        echo("YES"),("\n");
        echo($counter),("\n");
    } else{
        echo("NO"),("\n");
    }
?>