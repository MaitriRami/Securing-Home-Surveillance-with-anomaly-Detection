function getChild() {

var loginId = document.getElementById("id")

alert(loginId.value)

var htp = new XMLHttpRequest()

htp.onreadystatechange = function() {


if (htp.readyState == 4) {

alert(htp.responseText)

}

}

htp.open("GET", "http://localhost:5679/child_monitor?loginId="+loginId.value, true)
htp.send()

}
