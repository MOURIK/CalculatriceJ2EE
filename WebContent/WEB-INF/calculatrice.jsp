<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ma calculatrice</title>
</head>
<body>

<form method="post">
 <input name="terme1" type="number" step="any"/>+<input name="terme2" type="number" step="any"/> = <input name="Valider" type="submit" />
</form>

Résultat : ${empty erreur? resultat : erreur }

</body>
</html>