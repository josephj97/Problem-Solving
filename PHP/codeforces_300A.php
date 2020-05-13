<!-- http://codeforces.com/contest/300/problem/A -->
<?php
    $n = (int)readline();
    $arr = explode(' ', readline());
    $arr1 =[];
    $arr2 =[];
    $arr3 =[];
    for($i = 0;$i<$n;$i++){
        if($arr[$i] < 0){
            $arr1[] = $arr[$i];
        }
        else if($arr[$i] == 0){
            $arr3[] = $arr[$i];
        }
        else{
            $arr2[] = $arr[$i];
        }
    }
    if(sizeof($arr1)%2 == 0){
        $arr3[] = $arr1[sizeof($arr1)-1];
        unset($arr1[sizeof($arr1)-1]);
    }
    if(sizeof($arr2) == 0){
        $arr2[] = $arr1[sizeof($arr1)-1];
        unset($arr1[sizeof($arr1)-1]);
        $arr2[] = $arr1[sizeof($arr1)-1];
        unset($arr1[sizeof($arr1)-1]);
    }
    echo ("\n"),(sizeof($arr1)),(' ');
    for($i = 0;$i<sizeof($arr1);$i++){
        echo ($arr1[$i]),(' ');
    }
    echo ("\n"),(sizeof($arr2)),(' ');
    for($i = 0;$i<sizeof($arr2);$i++){
        echo ($arr2[$i]),(' ');
    }
    echo ("\n"),(sizeof($arr3)),(' ');
    for($i = 0;$i<sizeof($arr3);$i++){
        echo ($arr3[$i]),(' ');
    }
    echo ("\n");
    
?>