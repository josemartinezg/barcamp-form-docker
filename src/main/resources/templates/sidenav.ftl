<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
            <div class="sb-sidenav-menu">
                <div class="nav">
                    <div class="sb-sidenav-menu-heading">Formulario</div>
                    <a class="nav-link" href="/form">
                        <div class="sb-nav-link-icon">
                            <i class="fa fa-wpforms" aria-hidden="true"></i>
                        </div>Realizar Formulario
                        <div class="sb-sidenav-collapse-arrow"></div>
                    </a>

                    <div class="sb-sidenav-menu-heading">Resultados</div>
                    <a class="nav-link" href="/charts">
                        <div class="sb-nav-link-icon"><i class="fa fa-bar-chart"></i>
                        </div>Graficos
                        <div class="sb-sidenav-collapse-arrow"></div>
                    </a>
                    <a class="nav-link" href="/respuestas">
                        <div class="sb-nav-link-icon"><i class="fa fa-bar-chart"></i>
                        </div>Respuestas
                        <div class="sb-sidenav-collapse-arrow"></div>
                    </a>

                    <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-parent="#sidenavAccordion">
                        <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#pagesCollapseAuth" aria-expanded="false" aria-controls="pagesCollapseAuth"
                            >Authentication
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div
                                ></a>
                            <div class="collapse" id="pagesCollapseAuth" aria-labelledby="headingOne" data-parent="#sidenavAccordionPages">
                                <nav class="sb-sidenav-menu-nested nav"><a class="nav-link" href="login.html">Login</a><a class="nav-link" href="register.html">Register</a><a class="nav-link" href="password.html">Forgot Password</a></nav>
                            </div>
                            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#pagesCollapseError" aria-expanded="false" aria-controls="pagesCollapseError"
                            >Error
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div
                                ></a>
                            <div class="collapse" id="pagesCollapseError" aria-labelledby="headingOne" data-parent="#sidenavAccordionPages">
                                <nav class="sb-sidenav-menu-nested nav"><a class="nav-link" href="401.html">401 Page</a><a class="nav-link" href="404.html">404 Page</a><a class="nav-link" href="500.html">500 Page</a></nav>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </nav>
    </div>
    <#-- Contenido -->
    <#include plantilla>
</div>
