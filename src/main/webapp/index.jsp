<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Game Result</title>
</head>
<style>
body{
background-color: black;
color: white;
}


</style>




<body>
    <h1>Game Result</h1>
    <p>Random Number: ${randomNumber}</p>
    <p>Result: ${result}</p>
    <form action="games" method="post">
        <label for="number">Enter a number between 1 and 10:</label>
        <input type="number" id="number" name="number" min="1" max="10" required>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
