<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Public Forum</title>

    <style type="text/css">
        th {
            text-align: left;
        }


    </style>


</head>
<body>


<h2>Public Forum</h2>
<form action="http://localhost:8080/forum" method="post">

    <table>

        <tr><th>Name</th><th><input type="text" name="username"></th></tr>

        <tr><th>Message</th><th><textarea rows="15" cols="30" name="message"></textarea></th></tr>

    </table>
        <div>
            <p>Your favorite sport<br>
            <input type="checkbox" name="sport" value="Basket Ball" />
                <label>Basket Ball</label><br>
            <input type="checkbox" name="sport" value="Football" />
                <label>Football</label><br>
            <input type="checkbox" name="sport" value="Badminton" />
                <label>Badminton</label><br>
            <input type="checkbox" name="sport" value="Swimming" />
                <label>Swimming</label>
        </div>
    <tr><th><input type="submit" name="action" value="Submit"></th>
        <th><input type="submit" name="action" value="Search" ></th></tr>
</form>



</body>
</html>