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
                      <h3 class="card-title"><b> Thêm lớp học </b> </h4>
                      <div class="card-body">
                          <form>
                                <div class="form-group row">
                                    <label for="inputId" class="col-sm-2 col-form-label"> <b>Tên môn học</b></label>
                                    <div class="col-sm-10">
                                      <input type="text" class="form-control" id="inputId" placeholder="Tên môn học">
                                    </div>
                                  </div>
                                <div class="form-group row">
                                  <label for="inputName" class="col-sm-2 col-form-label"> <b>Ngày trong tuần</b></label>
                                  <div class="col-sm-4">
                                      <select class="custom-select">
                                          <option selected> Thứ 2</option>
                                          <option value="1"> Thứ 3</option>
                                          <option value="2"> Thứ 4</option>
                                          <option value="3"> Thứ 5</option>
                                          <option value="4"> Thứ 6</option>
                                          <option value="5"> Thứ 7</option>
                                        </select>
                                  </div>
                                  <label for="inputName" class="col-sm-1 col-form-label"> <b>Từ tiết</b></label>
                                  <div class="col-sm-2">
                                      <input type="number" class="form-control" >
                                  </div>
                                  <label for="inputName" class="col-sm-1 col-form-label"> <b>đến</b></label>
                                  <div class="col-sm-2">
                                      <input type="number" class="form-control" >
                                  </div>
                                </div>
                                <div class="form-group row">
                                    <label for="inputId" class="col-sm-2 col-form-label"> <b> Số lượng </b></label>
                                    <div class="col-sm-4">
                                      <input type="number" class="form-control" id="inputId">
                                    </div>
                                    <label for="inputId" class="col-sm-1 col-form-label"> <b> Phòng học </b></label>
                                    <div class="col-sm-5">
                                      <input type="text" class="form-control" id="inputId" placeholder="Phòng học">
                                    </div>
                                  </div>
                                  <div class="form-group row">
                                      <label for="inputId" class="col-md-2 col-form-label"> <b> Ngày bắt đầu </b></label>
                                      <div class="col-md-4">
                                        <input type="date" class="form-control" id="inputId">
                                      </div>
                                      <label for="inputId" class="col-md-1 col-form-label"> <b> Ngày kết thúc </b></label>
                                      <div class="col-md-5">
                                        <input type="date" class="form-control" id="inputId" placeholder="Phòng học">
                                      </div>
                                    </div>
                                    <div class="form-group row">
                                        <label for="inputName" class="col-sm-2 col-form-label"> Tên lớp </label>
                                        <div class="col-sm-10">
                                          <input type="text" class="form-control disab" id="inputName" placeholder="Tên lớp">
                                        </div>
                                      </div>
                            </form>
                      </div>
                </div>
        </div>
      
        <div class="row justify-content-center">
          <a href="./listStudent.html" class="btn btn-info col-3"> <i class="fa fa-check"></i> Lưu thay đổi</a>
          <a href="./listStudent.html" class="btn btn-danger col-3"> <i class="fa fa-times"></i> Hủy </a>
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