$(function() {
    "use strict";


  // chart 1

       var ctx = document.getElementById('dash1-chart-1').getContext('2d');


     var gradientStroke = ctx.createLinearGradient(0, 0, 0, 300);
      gradientStroke.addColorStop(0, '#ee0979');  
      gradientStroke.addColorStop(1, '#ff6a00'); 
              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct'],
          datasets: [{
            label: 'Total Orders',
            data: [50, 150, 100, 190, 130, 90, 100, 190, 120, 140],
            backgroundColor:'rgba(245, 54, 92, 0.3)',
            borderColor: '#f5365c',
            pointBackgroundColor:'#000',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            //lineTension: "5",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#585757',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  display: false,
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });

       // chart 2

       var ctx = document.getElementById('dash1-chart-2').getContext('2d');


       var gradientStroke = ctx.createLinearGradient(0, 0, 0, 300);
        gradientStroke.addColorStop(0, '#00b09b');  
       gradientStroke.addColorStop(1, '#96c93d'); 

              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct'],
          datasets: [{
            label: 'Total Revenue',
            data: [90, 100, 190, 50, 150, 100, 190, 130, 120, 140],
            backgroundColor: 'rgba(2, 186, 90, 0.3)',
            borderColor: '#02ba5a',
            pointBackgroundColor:'#000',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            //lineTension: "5",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#585757',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  display: false,
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });



// chart 3

       var ctx = document.getElementById('dash1-chart-3').getContext('2d');

         var gradientStroke = ctx.createLinearGradient(0, 0, 0, 300);
         gradientStroke.addColorStop(0, '#ff4b1f');  
         gradientStroke.addColorStop(1, '#ff9068'); 

              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct'],
          datasets: [{
            label: 'Support Requests',
            data: [120, 140, 50, 90, 100, 190 ,150, 100, 190, 130],
            backgroundColor: 'rgba(251, 165, 64, 0.3)',
            borderColor: '#fba540',
            pointBackgroundColor:'#000',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            //lineTension: "5",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#585757',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  display: false,
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });


// chart 4

       var ctx = document.getElementById('dash1-chart-4').getContext('2d');

       var gradientStroke = ctx.createLinearGradient(0, 0, 0, 300);
         gradientStroke.addColorStop(0, '#2575fc');  
         gradientStroke.addColorStop(1, '#6a11cb'); 
              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct'],
          datasets: [{
            label: 'Messages',
            data: [30, 150, 100, 190, 130, 90, 100, 200, 120, 50],
            backgroundColor: 'rgba(20, 171, 239, 0.31)',
            borderColor: '#14abef',
            pointBackgroundColor:'#000',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            //lineTension: "5",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#585757',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  display: false,
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#585757'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });



   // chart 5
	 
		  var ctx = document.getElementById('dash1-chart5').getContext('2d');

		   var gradientStroke1 = ctx.createLinearGradient(0,230,0,50);

	      gradientStroke1.addColorStop(1, '#009efd');
	      gradientStroke1.addColorStop(0.2, '#2af598');


        var gradientStroke2 = ctx.createLinearGradient(0,230,0,50);

        gradientStroke2.addColorStop(1, '#ee0979');
        gradientStroke2.addColorStop(0.2, '#ff6a00');
		
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
					datasets: [{
						label: 'Views',
						data: [100, 200, 150, 240, 180, 140, 200, 210, 170, 190, 240, 140],
						backgroundColor: gradientStroke1,
            hoverBackgroundColor: gradientStroke1,
						borderColor: "transparent",
						borderWidth: 1
					},{
						label: 'Sales',
						data: [50, 150, 100, 190, 130, 90, 150, 160, 120, 140, 190, 90],
						backgroundColor: gradientStroke2,
            hoverBackgroundColor: gradientStroke2,
						borderColor: "transparent",
						borderWidth: 1
					}]
				},
			options: {
				legend: {
				  display: false,
				  labels: {
					fontColor: '#585757',  
					boxWidth:40
				  }
				},
				tooltips: {
          display: false,
				  displayColors:false
				},	
			  scales: {
				  xAxes: [{
				  	//categoryPercentage: .3,
					barPercentage: .4,
					stacked: false,
					ticks: {
						beginAtZero:true,
						fontColor: '#585757'
					},
					gridLines: {
					  display: true ,
					  color: "rgba(0, 0, 0, 0.03)"
					},
				  }],
				   yAxes: [{
				   	stacked: false,
					ticks: {
						beginAtZero:true,
						fontColor: '#585757'
					},
					gridLines: {
					  display: true ,
					  color: "rgba(0, 0, 0, 0.03)"
					},
				  }]
				 }

			 }
			}); 



 // chart 6

       var ctx = document.getElementById('dash1-chart-6').getContext('2d');


       var gradientStroke = ctx.createLinearGradient(0,230,0,50);

      gradientStroke.addColorStop(1, 'rgba(120, 92, 10, 0.47)');
      gradientStroke.addColorStop(0.2, 'rgba(255, 255, 255, 0.00)');
      gradientStroke.addColorStop(0, 'rgba(255, 255, 255, 0.0)'); 

              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
          datasets: [{
            label: 'Top Selling Country',
            data: [542, 480, 430, 550, 530, 453, 380, 434, 568, 610, 700, 630],
            backgroundColor: gradientStroke,
            borderColor: '#785c0a',
            pointBackgroundColor:'#fff',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            //lineTension: "5",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#ddd',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });



   // chart 7

       var ctx = document.getElementById('dash1-chart-7').getContext('2d');


       var gradientStroke = ctx.createLinearGradient(0,230,0,50);

      gradientStroke.addColorStop(1, 'rgba(48, 58, 68, 0.47)');
      gradientStroke.addColorStop(0.2, 'rgba(255, 255, 255, 0.00)');
      gradientStroke.addColorStop(0, 'rgba(255, 255, 255, 0.0)'); 

              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug'],
          datasets: [{
            label: 'Top Selling Product',
            data: [40, 500, 650, 700, 1200, 1250, 1300, 1900],
            backgroundColor: gradientStroke,
            borderColor: '#303a44',
            pointBackgroundColor:'#fff',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            //lineTension: "5",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#ddd',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });




  // chart 9

		var ctx = document.getElementById("dash1-chart-8").getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'pie',
				data: {
					labels: ["Direct", "Affiliate", "E-mail"],
					datasets: [{
						backgroundColor: [
							"#02ba5a",
							"#fba540",
							"#d13adf"
						],
						data: [5856, 2602, 1802],
						borderWidth: [0, 0, 0]
					}]
				},
			options: {
			   legend: {
				 position :"bottom",	
				 display: false,
				    labels: {
					  fontColor: '#ddd',  
					  boxWidth:15
				   }
				},
				//cutoutPercentage: 60,
				tooltips: {
				  displayColors:false
				}
			   }
			});


// chart 9

       var ctx = document.getElementById('dash1-chart-9').getContext('2d');


       var gradientStroke = ctx.createLinearGradient(0,230,0,50);

      gradientStroke.addColorStop(1, 'rgba(255, 255, 255, 0.32)');
      gradientStroke.addColorStop(0.2, 'rgba(255, 255, 255, 0.00)');
      gradientStroke.addColorStop(0, 'rgba(255, 255, 255, 0.0)'); 

              
       var myChart = new Chart(ctx, {
        type: 'line',
        data: {
          labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct'],
          datasets: [{
            label: 'Sales',
            data: [130, 100, 90, 120, 150, 110, 140, 120, 160, 120],
            backgroundColor: 'rgba(20, 171, 239, 0.30)',  
            borderColor: 'transparent',
            pointBackgroundColor:'#fff',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            lineTension: "0",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          },{
            label: 'Orders',
            data: [80, 50, 40, 70, 100, 70, 90, 70, 90, 70],
            backgroundColor: 'rgba(20, 171, 239)',
            borderColor: 'transparent',
            pointBackgroundColor:'#fff',
            pointHoverBackgroundColor:'#fff',
            pointBorderColor :'#fff',
            pointHoverBorderColor :'#fff',
            lineTension: "0",
            pointBorderWidth :2,
            pointRadius :0,
            pointHoverRadius :4,
            borderWidth: 2,
          }]
        }
        ,
        options: {
                legend: {
                  display: false,
                  labels: {
                    fontColor: '#ddd',  
                    boxWidth:40
                  }
                },
                tooltips: {
                  display: true,
                  displayColors:false
                },  
              scales: {
                  xAxes: [{
                    barPercentage: .5,
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }],
                   yAxes: [{
                    display: false,
                    ticks: {
                        beginAtZero:true,
                        fontColor: '#ddd'
                    },
                    gridLines: {
                      display: true ,
                      color: "rgba(221, 221, 221, 0.08)"
                    },
                  }]
                 }

             }
      });

	  // chart 11
	  
	$('#dash1-chart-10').sparkline([5,8,7,10,9,10,8,6,4,6,8,7,6,8], {
            type: 'bar',
            height: '35',
            barWidth: '2',
            resize: true,
            barSpacing: '4',
            barColor: '#fba540'
        });
	  
	  
	 // chart 12

     $("#dash1-chart-11").sparkline([2, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6, 5, 4, 3, 4, 5, 6, 5, 4, 4, 5], {
        type: 'discrete',
        width: '85',
        height: '40',
        lineColor: '#d13adf',
        lineHeight: 20

     });
	  

	// chart 13
	  
	$('#dash1-chart-12').sparkline([5,8,7,10,9,10,8,6,4,6,8,7,6,8], {
            type: 'bar',
            height: '35',
            barWidth: '2',
            resize: true,
            barSpacing: '4',
            barColor: '#3b5998'
        });
	  

	  // chart 14
	
	 $("#dash1-chart-13").sparkline([2, 5, 3, 7, 5, 10, 3, 6, 5, 7], {
            type: 'line',
            width: '85',
            height: '40',
            lineWidth: '1.5',
            lineColor: '#55acee',
            fillColor: 'transparent',
            spotColor: '#55acee',
            highlightSpotColor: !1,
          	highlightLineColor: !1,
          	minSpotColor: !1,
          	maxSpotColor:!1,
        })


	// chart 15
	  
	$('#dash1-chart-14').sparkline([5,8,7,10,9,10,8,6,4,6,8,7,6,8], {
            type: 'bar',
            height: '35',
            barWidth: '2',
            resize: true,
            barSpacing: '4',
            barColor: '#333333'
        });


	// chart 16


	 $("#dash1-chart-15").sparkline([2, 5, 3, 7, 5, 10, 3, 6, 5, 7], {
            type: 'line',
            width: '85',
            height: '40',
            lineWidth: '1.5',
            lineColor: '#0976b4',
            fillColor: 'transparent',
            spotColor: '#0976b4',
            highlightSpotColor: !1,
          	highlightLineColor: !1,
          	minSpotColor: !1,
          	maxSpotColor:!1,
        })
	  


	 // easy pie chart 
	
	 $('.server-easy1').easyPieChart({
		easing: 'easeOutBounce',
		barColor : '#27bb04',
		lineWidth: 8,
		trackColor : 'rgba(0, 0, 0, 0.10)',
		scaleColor: false,
		onStep: function(from, to, percent) {
			$(this.el).find('.server-easy_percent').text(Math.round(percent));
		}
	 });	

	 $('.server-easy2').easyPieChart({
		easing: 'easeOutBounce',
		barColor : '#fd1a67',
		lineWidth: 8,
		trackColor : 'rgba(0, 0, 0, 0.10)',
		scaleColor: false,
		onStep: function(from, to, percent) {
			$(this.el).find('.server-easy_percent').text(Math.round(percent));
		}
	 });

   $('.server-easy3').easyPieChart({
		easing: 'easeOutBounce',
		barColor : '#3f5cff',
		lineWidth: 8,
		trackColor : 'rgba(0, 0, 0, 0.10)',
		scaleColor: false,
		onStep: function(from, to, percent) {
			$(this.el).find('.server-easy_percent').text(Math.round(percent));
		}
	 });

   $('.server-easy4').easyPieChart({
		easing: 'easeOutBounce',
		barColor : '#ff531d',
		lineWidth: 8,
		trackColor : 'rgba(0, 0, 0, 0.10)',
		scaleColor: false,
		onStep: function(from, to, percent) {
			$(this.el).find('.server-easy_percent').text(Math.round(percent));
		}
	 });


	  
	  
	  
	  
	  
	  

     });	