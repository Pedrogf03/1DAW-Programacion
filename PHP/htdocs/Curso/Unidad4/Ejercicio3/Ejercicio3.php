<?php
$num = $_GET['num'];

for($i = 0; $i <= 10; $i++) {
    echo $num, ' x ', $i, ' = ', $num * $i, '<br/>';
}