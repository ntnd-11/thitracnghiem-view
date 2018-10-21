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
                      <h5 class="card-title"> Danh sách Sinh viên </h5>
                  </div>
                  <div class="col-md-3" >
                    <a  class="btn btn-success" href="./addStudent.jsp">
                      <i class="fa fa-plus"></i>
                      Thêm sinh viên
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
                <div class="row justify-content-center">
                <div class="col-md-8">
                    <select class="custom-select" id="inputGroupSelect01">
                        <option selected> Chọn lớp ...</option>
                        <option value="1"> Lập Trình Web Sáng Thứ 7 2018-2019</option>
                        <option value="2"> Hệ Quản Trị Cơ Sở Dữ Liệu chiều thứ 2 2018-2019 </option>
                        <option value="3"> Hệ Quản Trị Cơ Sở Dữ Liệu chiều thứ 4 2018-2019 </option>
                      </select>
                  </div>
                </div>
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                      <th width="2%">
                         <input type="checkbox" aria-label="Radio button for following text input">
                      </th>
                      <th width="8%">
                        Mã SV
                      </th>
                      <th width="20%">
                        Họ tên
                      </th>

                      <th width="10%">
                        Ngành
                      </th>
                      <th width="10%">
                        Lớp
                        </th>
                      <th width="10%">
                        Khóa
                      </th>
                      <th >
                        Ngày thêm
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
                        <td> Nguyễn Thành Đồng</td>
                        <td>
                            CNTT
                        </td>
                        <td>
                            161101
                        </td>
                        <td>
                          2016
                        </td>
                        <td> 2/2/2018 15:30 GMT</td>
                        <td>
                          <button class="btn btn-success" data-toggle="modal" data-target="#modalStudent"><i class="fa fa-eye"></i></button>
                          <a href="./editStudent.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
                       <tr>
                        <td>       
                              <input type="checkbox" aria-label="Radio button for following text input">
                        </td>
                        <td>1</td>
                        <td> Nguyễn Thành Đồng</td>
                        <td>
                            CNTT
                        </td>
                        <td>
                            161101
                        </td>
                        <td>
                          2016
                        </td>
                        <td> 2/2/2018 15:30 GMT</td>
                        <td>
                          <button class="btn btn-success" data-toggle="modal" data-target="#modalStudent"><i class="fa fa-eye"></i></button>
                          <a href="./editStudent.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
                       <tr>
                        <td>       
                              <input type="checkbox" aria-label="Radio button for following text input">
                        </td>
                        <td>1</td>
                        <td> Nguyễn Thành Đồng</td>
                        <td>
                            CNTT
                        </td>
                        <td>
                            161101
                        </td>
                        <td>
                          2016
                        </td>
                        <td> 2/2/2018 15:30 GMT</td>
                        <td>
                          <button class="btn btn-success" data-toggle="modal" data-target="#modalStudent"><i class="fa fa-eye"></i></button>
                          <a href="./editStudent.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
                       <tr>
                        <td>       
                              <input type="checkbox" aria-label="Radio button for following text input">
                        </td>
                        <td>1</td>
                        <td> Nguyễn Thành Đồng</td>
                        <td>
                            CNTT
                        </td>
                        <td>
                            161101
                        </td>
                        <td>
                          2016
                        </td>
                        <td> 2/2/2018 15:30 GMT</td>
                        <td>
                          <button class="btn btn-success" data-toggle="modal" data-target="#modalStudent"><i class="fa fa-eye"></i></button>
                          <a href="./editStudent.jsp" class="btn btn-warning"><i class="fa fa-pencil"></i></a>
                          <button class="btn btn-danger" data-toggle="modal" data-target="#modalConfirmDeleting"><i class="fa fa-trash"></i></button>
                        </td>
                      </tr>
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