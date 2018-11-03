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
                <div class="row ">
                    <div class="col-md-4">
                        <div class="card card-user">
                            <div class="row align-items-center justify-content-center">
                                <div class="col-md-6">
                                    <input type="text" class="form-control" placeholder="Số Câu Hỏi">
                                </div>
                                <div class="col-md-4">
                                    <div class="dropdown">
                                        <button type="button" class="btn btn  btn-round dropdown-toggle text-center bg-secondary" data-toggle="dropdown">
                                            Lĩnh Vực
                                        </button>
                                        <div class="dropdown-menu">
                                            <a class="dropdown-item" href="#">Toán</a>
                                            <a class="dropdown-item" href="#">Lý</a>
                                            <a class="dropdown-item" href="#">Hóa</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row justify-content-center">
                                <div class="col-md-9">
                                    <div class="card card-user border">
                                        <div class="card-header">
                                            <h4 class="card-title">Số câu theo mức độ</h4>
                                        </div>
                                        <div class="col-md-12">
                                            <div class="row justify-content-center ">
                                                <div class="col-md-3">
                                                    <div class="form-group justify-content-center text-center">
                                                        <input type="text" class="form-control" value="">
                                                        <p>Dễ</p>
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group justify-content-center text-center">
                                                        <input type="text" class="form-control" value="">
                                                        <p>TB</p>
                                                    </div>
                                                </div>
                                                <div class="col-md-3">
                                                    <div class="form-group justify-content-center text-center">
                                                        <input type="text" class="form-control" value="">
                                                        <p>Khó</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row justify-content-center ">
                                            <div class="form-group justify-content-center text-center">
                                                <input type="text" class="form-control" value="" disabled>
                                                <p>Số câu còn lại</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="btn btn-primary btn-round">Chọn ngẫu nhiên</div>
                            <div class="btn btn-primary btn-round">Chọn thủ công</div>
                        </div>
                        <div class="card">
                            <div class="card-header">
                                <h4 class="card-title">Tùy Chọn</h4>
                            </div>
                            <div class="card-body">
                                <ul class="list-unstyled ">
                                    <li>
                                        <div class="mb-1">
                                            <input type="text" class="form-control" placeholder="Thời Gian Mở">
                                        </div>
                                    </li>
                                    <li>
                                        <div class="mb-1">
                                            <input type="text" class="form-control" placeholder="Thời Lượng">
                                        </div>
                                    </li>
                                    <li>
                                        <div>
                                            <input type="text" class="form-control" placeholder="Lớp Thi">
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="card card-user">
                            <div class="card-header">
                                <h5 class="card-title">Danh Sách Câu Hỏi</h5>
                            </div>
                            <div class="card-body">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Stt</th>
                                            <th>Nội Dung</th>
                                            <th>Đáp án</th>
                                            <th class="text-center">Lựa Chọn</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>1</td>
                                            <td>yêu là gì:</td>
                                            <td>
                                                <p>A: Yêu là yêu</p>
                                                <p>B: Yêu là đau</p>
                                                <p>C: Yêu là cảm thông</p>
                                                <p>D: Yêu là ịch</p>
                                            </td>
                                            <td class="text-center"><a href="#"><i class="fa fa-edit" style="font-size:36px"></i></a>
                                            </td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>1</td>
                                            <td>yêu là gì:</td>
                                            <td>
                                                <p>A: Yêu là yêu</p>
                                                <p>B: Yêu là đau</p>
                                                <p>C: Yêu là cảm thông</p>
                                                <p>D: Yêu là ịch</p>
                                            </td>
                                            <td class="text-center"><a href="#"><i class="fa fa-edit" style="font-size:36px"></i></a>
                                            </td>
                                            <td></td>
                                        </tr>
                                         <tr>
                                            <td>1</td>
                                            <td>yêu là gì:</td>
                                            <td>
                                                <p>A: Yêu là yêu</p>
                                                <p>B: Yêu là đau</p>
                                                <p>C: Yêu là cảm thông</p>
                                                <p>D: Yêu là ịch</p>
                                            </td>
                                            <td class="text-center"><a href="#"><i class="fa fa-edit" style="font-size:36px"></i></a>
                                            </td>
                                            <td></td>
                                        </tr>
                                    </tbody>
                                </table>
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
                 <button type="submit" class="btn btn-primary btn-round float-right">Cập Nhật</button>
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