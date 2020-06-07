function getState() {
	var country = document.getElementById("country");
	var state = document.getElementById("state");
	alert("state");
	var http = new XMLHttpRequest();

	http.onreadystatechange = function() {
		if (http.readyState == 4) {

			var sdata = JSON.parse(http.responseText);
			alert(sdata);
			state.innerHTML = "";

			for (var i = 0; i < sdata.length; i++) {
				var sd = sdata[i];
				var opn = document.createElement("option");
				opn.text = sd.stateName;
				opn.value = sd.id;
				state.add(opn);
			}

		}
	}
	http.open("Get", "getStateByCountry?id="+country.value, true);
	http.send();

}