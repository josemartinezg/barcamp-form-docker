<div id="layoutSidenav_content">
    <main>
        <div class="container-fluid">
            <h1 class="mt-4">Main Header</h1>
            <ol class="breadcrumb mb-4">
                <li class="breadcrumb-item active">Path Header</li>
            </ol>
            <div class="card mb-4">
                <div class="card-header"><i class="fas fa-table mr-1"></i>Gráficos</div>
                <div class="card-body">
                    <div class="col-lg-8">
                        <div class="card mb-3">
                            <div class="card-header">
                                <i class="fas fa-chart-bar"></i>
                                Bar Chart Example</div>
                            <div class="card-body">
                                <div id="chart_div"></div>
                                <canvas id="myBarChart" width="100%" height="50"></canvas>
                            </div>
                            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <footer class="py-4 bg-light mt-auto">
        <div class="container-fluid">
            <div class="d-flex align-items-center justify-content-between small">
                <div class="text-muted">Copyright</div>
                <div>
                    <a href="#">Privacy Policy</a>
                    &middot;
                    <a href="#">Terms &amp; Conditions</a>
                </div>
            </div>
        </div>
    </footer>
</div>

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">

    // Load the Visualization API and the corechart package.
    google.charts.load('current', {'packages':['corechart']});

    // Set a callback to run when the Google Visualization API is loaded.
    google.charts.setOnLoadCallback(drawChart);

    // Callback that creates and populates a data table,
    // instantiates the pie chart, passes in the data and
    // draws it.
    function drawChart() {

        // Create the data table.
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Topping');
        data.addColumn('number', 'Votos');
        data.addRows([
            ['¿Las charlas donde usted participó cumplieron con sus expectativas?', ${p1}],
            ['¿Los expositores mostraron tener dominio del tema?', ${p2}],
            ['¿Las instalaciones del evento fueron confortables para usted?', ${p3}],

        ]);

        // Set chart options
        var options = {'title':'Grafico de Preguntas',
            'width':1600,
            'height':800};

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));
        chart.draw(data, options);
    }
</script>

<#--<script>-->
<#--    // Set new default font family and font color to mimic Bootstrap's default styling-->
<#--    Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';-->
<#--    Chart.defaults.global.defaultFontColor = '#292b2c';-->

<#--    // Bar Chart Example-->
<#--    var ctx = document.getElementById("myBarChart");-->
<#--    var myLineChart = new Chart(ctx, {-->
<#--        type: 'bar',-->
<#--        data: {-->
<#--            /*Arreglo de  nombres de subfamilias*/-->
<#--            labels: ["P1","P2","P3"],-->
<#--            datasets: [{-->
<#--                label: "Revenue",-->
<#--                backgroundColor: "rgba(2,117,216,1)",-->
<#--                borderColor: "rgba(2,117,216,1)",-->
<#--                /*Arreglo de dias por subfamilia*/-->
<#--                data: [${p1}, ${p2}, ${p3}],-->
<#--            }],-->
<#--        },-->
<#--        options: {-->
<#--            scales: {-->
<#--                xAxes: [{-->
<#--                    time: {-->
<#--                        unit: 'month'-->
<#--                    },-->
<#--                    gridLines: {-->
<#--                        display: false-->
<#--                    },-->
<#--                    ticks: {-->
<#--                        maxTicksLimit: 6-->
<#--                    }-->
<#--                }],-->
<#--                yAxes: [{-->
<#--                    ticks: {-->
<#--                        min: 0,-->
<#--                        max: 10,-->
<#--                        maxTicksLimit: 5-->
<#--                    },-->
<#--                    gridLines: {-->
<#--                        display: true-->
<#--                    }-->
<#--                }],-->
<#--            },-->
<#--            legend: {-->
<#--                display: false-->
<#--            }-->
<#--        }-->
<#--    });-->
<#--</script>-->
