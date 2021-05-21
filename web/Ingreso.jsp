<%@page import="Logica.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Clinica </title>
        <meta content="" name="descriptison">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="assets/img/favicon.png" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-datepicker/css/bootstrap-datepicker.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">
    </head>

    <body>
        <%  HttpSession misesion = request.getSession();
            String form = (String) request.getSession().getAttribute("uname");
            if (form == null) {
                response.sendRedirect("index.jsp");
            } else {
                Controladora control = new Controladora();
                misesion.setAttribute("control", control);
            }
        %>

        <!-- ======= Top Bar ======= -->
        <div id="topbar" class="d-none d-lg-flex align-items-center fixed-top">
            <div class="container d-flex">
                <div class="contact-info mr-auto">
                    <!--div vacio para separar las redes sociales-->
                </div>
                <div class="social-links">
                    <a href="#" class=""><i class="icofont-twitter"></i></a>
                    <a href="#" class=""><i class="icofont-facebook"></i></a>
                    <a href="#" class=""><i class="icofont-instagram"></i></a>
                    <a href="#" class=""><i class="icofont-skype"></i></a>
                    <a href="#" class=""><i class="icofont-linkedin"></i></a>
                </div>

            </div>
            <div>
                <p>Usuario:<%=request.getSession().getAttribute("uname")%></p>
            </div>
        </div>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top">
            <div class="container d-flex align-items-center">

                <h1 class="logo mr-auto"><a href="index.jsp">Clinica Odontologia</a></h1>
                <!-- aca podria ir un logo en vez del nombre -->
                <!--<a href="index.jsp" class="logo mr-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

                <nav class="nav-menu d-none d-lg-block">

                </nav><!-- .nav-menu -->



            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex align-items-center">
            <div class="container">
                <h1>Ingreso exitoso de Clinica</h1>
                <p style="padding-right: 50px">Elija una operacion</p>
                <button onclick="myFunction()"class="appointment-btn scrollto">Nuevo Turno</button>

                <form style="display: none" id="formulario" action="ServletTurno" method="post" >
                    <li>
                        <div class="form-row">
                            <div class="col-md-4 form-group">
                                <input type="datetime" name="date" class="form-control datepicker" id="date" placeholder="Appointment Date" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                                <div class="validate"></div>
                            </div>
                            <div class="col-md-4 form-group">
                                <div class="md-form md-outline">                                    
                                    <input type="time" id="default-picker" name="hora" class="form-control" placeholder="Select time">
                                    <label for="default-picker">Hora</label>                                    
                                </div>

                            </div>

                            <div class="form-group">
                                <textarea class="form-control" name="message" rows="5" placeholder="Motivo"></textarea>
                                <div class="validate"></div>
                            </div>

                            <div class="text-center"><button type="submit">Make an Appointment</button></div></li>
                    <button type="submit"style="background-color:#388bcf">Ingresar</button>
                </form>

                <script>
                    function myFunction() {
                        var x = document.getElementById("formulario");
                        if (x.style.display === "none") {
                            x.style.display = "block";
                        } else {
                            x.style.display = "none";
                        }
                    }
                </script>

                <button onclick="myFuncion()"class="appointment-btn scrollto">Nuevo Paciente</button>

                <form autocomplete="off" style="display: none" id="formapaciente" action="ServletPaciente" method="post" >
                    <hr>
                    <div><label for="dni"><b>DNI</b></label>
                        <input type="text" placeholder="Ingrese dni" name="dni" id="dni" required>
                    </div>

                    <div>
                        <label for="nombre"><b>NOMBRE</b></label>
                        <input type="text" placeholder="Nombre" name="nombre" id="nombre" required><label for="nombre"><b></b></label>
                    </div>

                    <div>
                        <label for="apellido"><b>APELLIDO</b></label>
                        <input type="text" placeholder="Apellido" name="apellido" id="apellido" required><label for="apellido"><b></b></label>
                    </div>

                    <div class="col-md-4">
                        <label for="date"><b>FECHA NACIMIENTO</b></label>
                        <input type="datetime" name="date" class="form-control datepicker" id="date" placeholder="Fecha Atencion" data-rule="minlen:4" data-msg="Ingrese al menos 4 caracteres">
                    </div>

                    <div>
                        <label for="nombre"><b>DIRECCION</b></label>
                        <input type="text" placeholder="direccion" name="direccion" id="direccion" required><label for="direccion"><b></b></label>
                    </div>
                    <div>
                        <label for="telefono"><b>TELEFONO</b></label>
                        <input type="text" placeholder="telefono" name="telefono" id="telefono" required><label for="telefono"><b></b></label>
                    </div>
                    <p><input type="checkbox" checked="checked"name="active" id="active" value="1" />Tiene ObraSocial?</p>


                    <button type="submit">Ingresar</button>
                </form>

                <script>
                    function obraSocial() {
                        var x = document.getElementById("check").checked;
                        var y = document.getElementById("obraSocial");
                        if (x) {
                            y.style.display = "block";
                        } else {
                            y.style.display = "none";
                        }
                    }

                </script>

                <script>
                    function myFuncion() {
                        var x = document.getElementById("formapaciente");
                        if (x.style.display === "none") {
                            x.style.display = "block";
                        } else {
                            x.style.display = "none";
                        }
                    }
                </script>

                <a onclick="myFuncion2()" class="appointment-btn scrollto">Lista Pacientes</a>

                <table id="tabla" style="display: none">
                    <thead>
                        <tr>
                            <td>Nombre</td>
                            <td>Apellido</td>
                            <td>Telefono</td>
                            <td>Fecha Nacimiento</td>
                                                    
                        </tr>
                        
                    </thead>
                    <tbody>
                        <tr>
                            <%Controladora control = (Controladora)misesion.getAttribute("control");
                              List<Paciente> listaPacientes = control.obtenerPacientes();
                              for(Paciente pac : listaPacientes){
                            %>
                            
                            <td><%=pac.getNombre()%></td>
                            <td><%=pac.getApellido()%></td>
                            <td><%=pac.getTelefono()%></td>
                            <td><%=pac.getFecha_nac()%></td>
                            <%}%>
                            <div></div>
                    </tbody>
                </table>
                    <script>
                    function myFuncion2() {
                        var x = document.getElementById("tabla");
                        if (x.style.display === "none") {
                            x.style.display = "block";
                        } else {
                            x.style.display = "none";
                        }
                    }
                </script>




                <!-- Button to open the modal login form -->

            </div>
        </section><!-- End Hero -->



        <!-- ======= Footer ======= -->


        <div id="preloader"></div>
        <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/jquery/jquery.min.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>
        <script src="assets/vendor/venobox/venobox.min.js"></script>
        <script src="assets/vendor/waypoints/jquery.waypoints.min.js"></script>
        <script src="assets/vendor/counterup/counterup.min.js"></script>
        <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
        <script src="assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>

    </body>

</html>
