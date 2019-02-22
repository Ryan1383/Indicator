$(function() {
    // Line Chart example


    // Bar Chart example

    var barData = {
        labels: ["Sunday", "Munday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
        datasets: [
            {
                label: "Data 1",
                backgroundColor:'#DADDE0',
                data: [45, 80, 58, 74, 54, 59, 40]
            },
            {
                label: "Data 2",
                backgroundColor: '#2ecc71',
                borderColor: "#fff",
                data: [29, 48, 40, 19, 78, 31, 85]
            }
        ]
    };
    var barOptions = {
        responsive: true,
        maintainAspectRatio: false
    };

    var ctx = document.getElementById("bar_chart").getContext("2d");
    new Chart(ctx, {type: 'bar', data: barData, options:barOptions}); 

    // doughnut chart example

    var doughnutData = {
        labels: ["App","Software","Laptop" ],
        datasets: [{
            data: [200,40,60],
            backgroundColor: ["rgb(255, 99, 132)","rgb(54, 162, 235)","rgb(255, 205, 86)"]
        }]
    } ;


    var doughnutOptions = {
        responsive: true
    };


    var ctx4 = document.getElementById("doughnut_chart").getContext("2d");
    new Chart(ctx4, {type: 'doughnut', data: doughnutData, options:doughnutOptions});

    // Radar chart example

   

   
});
