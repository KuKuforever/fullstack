function fetch() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/account/all",
        dataType: "json",
        async: true,
        success: function (result) {
            console.log(result);
            result.forEach(function (item) {

                $('#table').append('<tr><td>' + item.city + '</td>' +
                    '<td>' + item.state + '</td>' +
                    '<td>' + item.zip + '</td>' +
                    '<td>' + item.phone + '</td>' +
                    '<td>' + item.phone + '</td>' +
                    '<td>' + item.id + '</td></tr>');
            })
        },
        error: function (error) {
            alert("failed");
        }
    });
}