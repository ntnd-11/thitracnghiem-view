<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    List Question
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
  <!-- CSS Files -->
  <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="../assets/css/paper-dashboard.css?v=2.0.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="../assets/demo/demo.css" rel="stylesheet" />
</head>
<body class="">
  <div class="wrapper ">
    <!--silebarr chèn tại đây-->
    <jsp:include page="SideMenuQLDeThi.jsp"></jsp:include>  
    <div class="main-panel">
      <!-- Navbar -->
     <!---Navbar chèn tại đây-->
     <jsp:include page="NavBarQLDeThi.jsp"></jsp:include>  
      <!-- End Navbar -->
      <!-- <div class="panel-header panel-header-sm">
</div> -->
       
      <div class="content ">
                <div class="col-md-1 ml-5">
                    <a href="#" class="btn btn-info " role="button">Thêm Đề Thi  &#x2b; </a>
                </div>
                <div class="row justify-content-center">
                    <div class="col-md-10  ">
                        <div class="card card-user">
                            <div class="card-header">
                                <h5 class="card-title">Danh Sách Câu Hỏi</h5>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                   <table class="table">
                                    <thead>
                                        <tr class="col-md-12">
                                            <th>Mã Đề</th>
                                            <th>Ngày Ra Đề</th>
                                            <th>Ngày Kiểm Tra</th>
                                            <th>Lớp</th>
                                            <th>Lĩnh Vực</th>
                                            <th >Số Câu Hỏi</th>
                                            <th class="text-center">Lựa Chọn</th>
                                        </tr>
                                    </thead>
                                    <tbody >
                                        <tr>
                                            <td>1</td>
                                            <td>12/03/2018</td>
                                            <td>
                                              15/03/2018
                                            </td>
                                            <td>
                                                161101C
                                            </td>
                                            <td>Toán</td>
                                            <td>40</td>
                                            <td><a href="#"><i class="fa fa-edit float-right" style="font-size:36px"></i></a>
                                                <a href="#"><i class="fa fa-trash-o float-left" style="font-size:36px"></i></a>  
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>1</td>
                                            <td>12/03/2018</td>
                                            <td>
                                              15/03/2018
                                            </td>
                                            <td>
                                                161101C
                                            </td>
                                            <td>Toán</td>
                                            <td>40</td>
                                            <td><a href="#"><i class="fa fa-edit float-right" style="font-size:36px"></i></a>
                                                <a href="#"><i class="fa fa-trash-o float-left" style="font-size:36px"></i></a>  
                                            </td>
                                        </tr>
                                         <tr>
                                            <td>1</td>
                                            <td>12/03/2018</td>
                                            <td>
                                              15/03/2018
                                            </td>
                                            <td>
                                                161101C
                                            </td>
                                            <td>Toán</td>
                                            <td>40</td>
                                            <td><a href="#"><i class="fa fa-edit float-right" style="font-size:36px"></i></a>
                                                <a href="#"><i class="fa fa-trash-o float-left" style="font-size:36px"></i></a>  
                                            </td>
                                        </tr>
                                         <tr>
                                            <td>1</td>
                                            <td>12/03/2018</td>
                                            <td>
                                              15/03/2018
                                            </td>
                                            <td>
                                                161101C
                                            </td>
                                            <td>Toán</td>
                                            <td>40</td>
                                            <td><a href="#"><i class="fa fa-edit float-right" style="font-size:36px"></i></a>
                                                <a href="#"><i class="fa fa-trash-o float-left" style="font-size:36px"></i></a>  
                                            </td>
                                        </tr>
                                         <tr>
                                            <td>1</td>
                                            <td>12/03/2018</td>
                                            <td>
                                              15/03/2018
                                            </td>
                                            <td>
                                                161101C
                                            </td>
                                            <td>Toán</td>
                                            <td>40</td>
                                            <td><a href="#"><i class="fa fa-edit float-right" style="font-size:36px"></i></a>
                                                <a href="#"><i class="fa fa-trash-o float-left" style="font-size:36px"></i></a>  
                                            </td>
                                        </tr>
                                    </tbody>
                                </table> 
                                </div>
                                
                                <nav aria-label="Page navigation example" class="float-right">
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                                        <li class="page-item"><a class="page-link" href="#">Next</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
       <jsp:include page="../QLCauHoi/FooterQLCauHoi.jsp"></jsp:include>  

   
  <!--   Core JS Files   -->
  <script src="../assets/js/core/jquery.min.js"></script>
  <script src="../assets/js/core/popper.min.js"></script>
  <script src="../assets/js/core/bootstrap.min.js"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="../assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="../assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="../assets/js/paper-dashboard.min.js?v=2.0.0" type="text/javascript"></script>
  <!-- Paper Dashboard DEMO methods, don't include it in your project! -->
  <script src="../assets/demo/demo.js"></script>
</body>
</html>