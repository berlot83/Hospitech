

function create(){
var name = document.getElementById("name").value;
var lastname = document.getElementById("lastname").value;
var address = document.getElementById("address").value;
var zipcode = document.getElementById("zipcode").value;
var phone = document.getElementById("phone").value;
var cellphone = document.getElementById("cellphone").value;
var email = document.getElementById("email").value;
var numberAddress = document.getElementById("numberAddress").value;
var country = document.getElementById("country").value;
var city = document.getElementById("city").value;
var gender = document.getElementById("gender").value;
var birthday = document.getElementById("birthday").value;
var state = document.getElementById("state").value;
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
var inputs = {name, lastname, address, zipcode, phone, cellphone, email, numberAddress, country, city, gender, birthday, state};

var xhr = new XMLHttpRequest();
var url = "person/post";

xhr.onreadystatechange = function() {
    if(xhr.readyState == 4 && xhr.status == 200) {
        alert(xhr.responseText);
    }
}
xhr.open('POST', url, true);
xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
xhr.send("name="+name+"&lastname=" + lastname +"&address=" + address +"&zipcode=" + zipcode + "&phone=" + phone + "&cellphone=" + cellphone + "&email=" + email + "&numberAddress=" + numberAddress + "&country=" + country + "&city=" + city + "&gender=" + gender + "&birthday=" + birthday + "&state=" + state + "&username=" + username + "&password=" + password);

}