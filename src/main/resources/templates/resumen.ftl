<div id="layoutSidenav_content">
    <main>
        <div class="container-fluid">
            <h1 class="mt-4">Main Header</h1>
            <ol class="breadcrumb mb-4">
                <li class="breadcrumb-item active">Path Header</li>
            </ol>
            <div class="card mb-4">
                <div id="content-wrapper">

                    <div class="container-fluid">
                        <!-- DataTables Example -->
                        <div class="card mb-3">
                            <div class="card-header">
                                <i class="fas fa-table"></i>
                                Data Table Example</div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                        <tr>
                                            <th>¿Las charlas donde usted participó cumplieron con sus expectativas?</th>
                                            <th>¿Los expositores mostraron tener dominio del tema?</th>
                                            <th>¿Las instalaciones del evento fueron confortables para usted?</th>
                                            <th>¿Las charlas donde usted participó cumplieron con sus expectativas?</th>
                                            <th>Usuario</th>
                                        </tr>
                                        </thead>
                                        <tfoot>
                                        <tr>
                                            <th>¿Las charlas donde usted participó cumplieron con sus expectativas?</th>
                                            <th>¿Los expositores mostraron tener dominio del tema?</th>
                                            <th>¿Las instalaciones del evento fueron confortables para usted?</th>
                                            <th>¿Las charlas donde usted participó cumplieron con sus expectativas?</th>
                                            <th>Usuario</th>
                                        </tr>
                                        </tfoot>
                                        <tbody>
                                        <#if preguntas??>
                                            <#list preguntas as pregunta>
                                                <tr>
                                                    <td>${pregunta.respuesta1}</td>
                                                    <td>${pregunta.respuesta2}</td>
                                                    <td>${pregunta.respuesta3}</td>
                                                    <td>${pregunta.respuesta4}</td>
                                                    <td>${pregunta.usuario.username}</td>
                                                </tr>
                                            </#list>
                                        </#if>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
                        </div>

                        <p class="small text-center text-muted my-5">
                            <em>More table examples coming soon...</em>
                        </p>
                    </div>
                </div>
            </div>
        </div>
</main>

    <!-- Sticky Footer -->
    <footer class="sticky-footer">
        <div class="container my-auto">
            <div class="copyright text-center my-auto">
                <span>Copyright © Your Website 2019</span>
            </div>
        </div>
    </footer>

</div>
<!-- /.content-wrapper -->