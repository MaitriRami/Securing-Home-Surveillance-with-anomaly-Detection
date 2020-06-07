function getData() {

var loginId= document.getElementById("id")

alert(loginId.value)

var htp = new XMLHttpRequest()

htp.onreadystatechange = function() {
	
if (htp.readyState == 4) {

alert(htp.responseText)

}

}

htp.open("GET", "http://localhost:5679/unknown_person?loginId="+loginId.value, true)
htp.send()

}
