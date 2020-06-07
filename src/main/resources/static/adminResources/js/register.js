function getCity() {
	var state = document.getElementById("state");
	var city = document.getElementById("city");
	alert("city");
	var http = new XMLHttpRequest();

	http.onreadystatechange = function() {
		if (http.readyState == 4) {

			var sdata = JSON.parse(http.responseText);
			alert(sdata);
			city.innerHTML = "";

			for (var i = 0; i < sdata.length; i++) {
				var sd = sdata[i];
				var opn = document.createElement("option");
				opn.text = sd.cityName;
				opn.value = sd.id;
				city.add(opn);
			}

		}
		
	}
	http.open("Get", "getCityByState?id="+state.value, true);
	http.send();

}