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
    <jsp:include page="SideMenuQLSV.jsp"></jsp:include>  
    <div class="main-panel">
      <!-- Navbar -->
     <!---Navbar chèn tại đây-->
     <jsp:include page="NavBarQLSV.jsp"></jsp:include>  
      <!-- End Navbar -->
      <!-- <div class="panel-header panel-header-sm">
</div> -->
       <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
                <div class="row">
                  <div class="col-md-3">
                      <h4 class="card-title"> Danh sách Môn Học </h4>
                  </div>
                  <div class="col-md-3" >
                    <a  class="btn btn-success" href="./addSubject.jsp">
                      <i class="fa fa-plus"></i>
                      Mở lớp
                    </a>
                  </div>
                      <div class="navbar navbar-light">
                          <a class="navbar-brand"> Navbar </a>
                          <form class="form-inline">
                            <input class="form-control " type="search" placeholder="Tìm kiếm .." aria-label="Search">
                            <button class="btn btn-outline-success  py-2 my-sm-0" type="submit"><i class="fa fa-search"></i></button>
                          </form>
                        </div>
                  </div>
              </div>
              <div class="card-body">
            
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th width="2px">
                         <input type="checkbox" aria-label="Radio button for following text input">
                      </th>
                      <th width="4px">
                        Mã
                      </th>
                      <th>
                        Tên lớp
                      </th>

                      <th width="15%">
                        Môn học
                      </th>
                      <th width="10%">
                        Thời gian
                        </th>
                      
                      <th width="10%">
                        Bắt đầu
                      </th>
                      <th width="10%">
                          Kết thúc
                        </th>
                      <th class="20%">
                        Tùy chọn
                      </th>
                    </thead>
                    <tbody>
                     <tr>
                        <td>       
                              <input type="checkbox" aria-label="Radio button for following text input">
                        </td>
                        <td>1</td>
                        <td> Lập Trình Web ST7 1-5 2018-2019</td>
                        <td>
                            Lập trình Web
                        </td>
                        <td>
                            Tiết 1 - 5 Thứ 7
                        </td>
                        <td>
                            28/8/2/2018
                        </td>
                        <td>
                          15/12/2018
                        </td>
                        <td>
                          <a href="./editSubject.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
                      <tr>
                      <tr>
                        <td>       
                              <input type="checkbox" aria-label="Radio button for following text input">
                        </td>
                        <td>1</td>
                        <td> Lập Trình Web ST7 1-5 2018-2019</td>
                        <td>
                            Lập trình Web
                        </td>
                        <td>
                            Tiết 1 - 5 Thứ 7
                        </td>
                        <td>
                            28/8/2/2018
                        </td>
                        <td>
                          15/12/2018
                        </td>
                        <td>
                          <a href="./editSubject.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
                      <tr>
                      <tr>
                        <td>       
                              <input type="checkbox" aria-label="Radio button for following text input">
                        </td>
                        <td>1</td>
                        <td> Lập Trình Web ST7 1-5 2018-2019</td>
                        <td>
                            Lập trình Web
                        </td>
                        <td>
                            Tiết 1 - 5 Thứ 7
                        </td>
                        <td>
                            28/8/2/2018
                        </td>
                        <td>
                          15/12/2018
                        </td>
                        <td>
                          <a href="./editSubject.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
                      <tr>
                               
                     
                     
                    </tbody>
                  </table>
                  <nav aria-label="Page navigation example">
                      <ul class="pagination justify-content-center">
                        <li class="page-item disabled">
                          <a class="page-link" href="#" tabindex="-1">Previous</a>
                        </li>
                        <li class="page-item"><a class="page-link" href="#">1</a></li>
                        <li class="page-item"><a class="page-link" href="#">2</a></li>
                        <li class="page-item"><a class="page-link" href="#">3</a></li>
                        <li class="page-item">
                          <a class="page-link" href="#">Next</a>
                        </li>
                      </ul>
                    </nav>
                </div>
              </div>
            </div>
          </div>

      </div>
       <jsp:include page="../QLCauHoi/FooterQLCauHoi.jsp"></jsp:include>  

    </div>
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