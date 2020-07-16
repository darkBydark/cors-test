<html lang="en">
<head>
    <meta charset="UTF-8">
        <title>index.html</title>
    </meta>
</head>
<body>
<script type="text/javascript">
    $(function(){
    $.ajax("http://www.dhgate.com/test",{
    type: "GET",
    success: function(data, status, xhr) {
    alert(data.name);
},
    xhrFields: {
    withCredentials: true
},
    crossDomain: true
})
});
</script>
</body>
</html>