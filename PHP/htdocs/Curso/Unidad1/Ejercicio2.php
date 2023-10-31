<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <title>Unidad 1</title>
  </head>
  <body>
  <h1>Ejercicio 2</h1>
  <p>Programa que guarda el nombre de las asignaturas en variables. A continuación escribe el horario de clase usando esas variables.</p>
  <?php
  $ED = 'Entornos de Desarrollo';
  $BBDD = 'Bases de Datos';
  $SI = 'Sistemas Informáticos';
  $Prgm = 'Programación';
  $LM = 'Lenguajes de Marca';
  $FOL = 'Formación y Orientación Laboral';
  echo 
    '<table border="1" style="text-align: center">
      <tr>
        <th scope="colgroup" colspan="6"><strong>HORARIO</strong></th>
      </tr>
      <tr>
        <td>Hora</td>
        <td>Lunes</td>
        <td>Martes</td>
        <td>Miércoles</td>
        <td>Jueves</td>
        <td>Viernes</td>
      </tr>
      <tr>
        <td>8:25 - 9:20</td>
        <td scope="row" rowspan="2" style="background-color: blue">'
          , $ED ,
        '</td>
        <td scope="row" rowspan="2" style="background-color: green">'
          , $BBDD ,
       '</td>
        <td style="background-color: brown">', $SI ,'</td>
        <td scope="row" rowspan="2" style="background-color: lime">'
          , $Prgm ,
        '</td>
        <td style="background-color: burlywood">', $LM ,'</td>
      </tr>
      <tr>
        <td>9:20 - 10:15</td>
        <td style="background-color: darkgoldenrod">'
          , $FOL ,
       '</td>
        <td style="background-color: green">', $BBDD ,'</td>
      </tr>
      <tr>
        <td>10:15 - 11:10</td>
        <td style="background-color: green">', $BBDD ,'</td>
        <td style="background-color: burlywood">', $LM ,'</td>
        <td style="background-color: brown">', $SI ,'</td>
        <td style="background-color: green">', $BBDD ,'</td>
        <td style="background-color: lime">', $Prgm ,'</td>
      </tr>
      <tr>
        <td scope="colgroup" colspan="6"></td>
      </tr>
      <tr>
        <td>11:30 - 12:25</td>
        <td style="background-color: burlywood">', $LM ,'</td>
        <td style="background-color: lime">', $Prgm ,'</td>
        <td scope="row" rowspan="2" style="background-color: lime">'
          , $Prgm ,
        '</td>
        <td style="background-color: blue">', $ED ,'</td>
        <td style="background-color: lime">', $Prgm ,'</td>
      </tr>
      <tr>
        <td>12:25 - 13:20</td>
        <td scope="row" rowspan="2" style="background-color: brown">'
          , $SI ,
        '</td>
        <td scope="row" rowspan="2" style="background-color: brown">'
        , $SI ,
        '</td>
        <td style="background-color: darkgoldenrod">'
        , $FOL ,
        '</td>
        <td style="background-color: brown">', $SI ,'</td>
      </tr>
      <tr>
        <td>13:20 14:15</td>
        <td style="background-color: burlywood">', $LM ,'</td>
        <td style="background-color: brown">', $SI ,'</td>
        <td style="background-color: darkgoldenrod">'
        , $FOL ,
        '</td>
      </tr>
    </table>';
    ?>
  </body>
</html>