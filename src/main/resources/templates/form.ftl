<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Barcamp RD 2020 - Encuesta de Satisfaccion</title>
    <link href="/css/styles.css" rel="stylesheet" />
    <link href="/css/sb-admin.css" rel="stylesheet" />
    <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet" crossorigin="anonymous" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/all.min.js" crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
<#--    Contenido   -->
<div id="layoutSidenav_content">
    <main>
        <div class="container-fluid">
            <h1 class="mt-4">Main Header</h1>
            <ol class="breadcrumb mb-4">
                <li class="breadcrumb-item active">Path Header</li>
            </ol>
            <div class="card mb-4">
                <div class="card-header"><i class="fas fa-table mr-1"></i>Cuestionario</div>
                <div class="card-body">
                    <div class="row">
                    <form action="/submit" method="get">
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-xl-12 col-md-6">
                                    <label for="respuesta1">¿Las charlas donde usted participó cumplieron con sus expectativas?</label>
                                    <select class="form-control" id="respuesta1" name="respuesta1">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                    </select>
                                </div>
                                <div class="col-xl-12 col-md-6">
                                    <label for="respuesta2">¿Los expositores mostraron tener dominio del tema??</label>
                                    <select class="form-control" id="respuesta2" name="respuesta2">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-xl-12 col-md-6">
                                    <label for="respuesta3">¿Las instalaciones del evento fueron confortables para usted?</label>
                                    <select class="form-control" id="respuesta3" name="respuesta3">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                    </select>
                                </div>
                                <div class="col-xl-12 col-md-6">
                                    <label for="respuesta4">¿Las charlas donde usted participó cumplieron con sus expectativas?</label>
                                    <textarea type="text" id="respuesta4" name="respuesta4" class="form-control form-control-"></textarea>
                                </div>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
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
<script src="https://code.jquery.com/jquery-3.4.1.min.js" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="/js/scripts.js"></script>
<script src="/js/home.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="/js/demo/chart-area-demo.js"></script>
<script>
    // Set new default font family and font color to mimic Bootstrap's default styling
    Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
    Chart.defaults.global.defaultFontColor = '#292b2c';

    // Bar Chart Example
    var ctx = document.getElementById("myBarChart");
    var myLineChart = new Chart(ctx, {
        type: 'bar',
        data: {
            /*Arreglo de  nombres de subfamilias*/
            labels: ["P1","P2","P3","P4","P5"],
            datasets: [{
                label: "Revenue",
                backgroundColor: "rgba(2,117,216,1)",
                borderColor: "rgba(2,117,216,1)",
                /*Arreglo de dias por subfamilia*/
                data: [1,2,3,4,5],
            }],
        },
        options: {
            scales: {
                xAxes: [{
                    time: {
                        unit: 'month'
                    },
                    gridLines: {
                        display: false
                    },
                    ticks: {
                        maxTicksLimit: 6
                    }
                }],
                yAxes: [{
                    ticks: {
                        min: 0,
                        max: 15000,
                        maxTicksLimit: 5
                    },
                    gridLines: {
                        display: true
                    }
                }],
            },
            legend: {
                display: false
            }
        }
    });
</script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
<script src="/js/demo/datatables-demo.js"></script>
<script>
    $("#carrito").change(function () {
        var selectedCart = $(this).children("option:selected").val();
        window.location.replace("/agregarArticulo/" + selectedCart.toString());
    });
</script>
<script>
    $("#art-carrito").change(function () {
        var selectedCart = $(this).children("option:selected").val();
        window.location.replace("/articulos/" + selectedCart.toString());
    });
</script>
<script type="text/javascript">
    $("#clientes").change(function () {
        var id = document.getElementById("clientes").value;
        window.location.href = "/ver-alquileres/" + id;
    });

</script>
</body>
</html>