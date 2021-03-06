import "./style.css";
import React, {useState, useEffect} from "react";

function App() {
  const [jsonObj, setJsonObj] = useState([]);
  const config = {
    headers: {
      Accept: "application/json",
    },
  };
  useEffect(() => {
    fetch("/main", config)
    .then((res) => res.json())
    .then((res) => {
      var myTbody = document.getElementById("tbody");

      while (myTbody.firstChild) {
        myTbody.removeChild(myTbody.lastChild);
      } //  남아있던 기록 지움
      for (var i = 0; i < res.length; i++) {
        var myTr = document.createElement("tr");
        var myTd1 = document.createElement("td");
        var myTd2 = document.createElement("td");
        var myTd3 = document.createElement("td");

        myTd1.textContent = res[i].id;
        myTd2.textContent = res[i].ip;
        myTd3.textContent = res[i].connectionDate;

        myTr.appendChild(myTd1);
        myTr.appendChild(myTd2);
        myTr.appendChild(myTd3);

        myTbody.appendChild(myTr);
      } // child (data) 추가
    });
  }, []);

  function maketable() {
    console.log("jsonObj", jsonObj);
    var myTbody = document.getElementById("tbody");

    while (myTbody.firstChild) {
      myTbody.removeChild(myTbody.lastChild);
    } //  남아있던 기록 지움
    for (var i = 0; i < jsonObj.length; i++) {
      var myTr = document.createElement("tr");
      var myTd1 = document.createElement("td");
      var myTd2 = document.createElement("td");
      var myTd3 = document.createElement("td");

      myTd1.textContent = jsonObj[i].id;
      myTd2.textContent = jsonObj[i].ip;
      myTd3.textContent = jsonObj[i].connection_date;

      myTr.appendChild(myTd1);
      myTr.appendChild(myTd2);
      myTr.appendChild(myTd3);

      myTbody.appendChild(myTr);
    } // child (data) 추가
  }

  return (
      <div className="content">
        <table>
          <thead>
          <tr>
            <th>id</th>
            <th>ip</th>
            <th>connection_date</th>
          </tr>
          </thead>
          <tbody id="tbody"></tbody>
        </table>
      </div>
  );
}

export default App;
