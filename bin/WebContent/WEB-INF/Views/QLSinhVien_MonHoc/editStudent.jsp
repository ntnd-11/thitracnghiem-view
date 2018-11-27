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
                      <h3 class="card-title"><b> Sửa thông tin sinh viên - lớp học </b> </h4>
                      <div class="card-body">
                          <form>
                              <div class="form-group row">
                                  <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
                                  <div class="col-sm-10">
                                    <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="fullsuper@gamil.com">
                                  </div>
                                </div>
                                <div class="form-group row">
                                    <label for="inputId" class="col-sm-2 col-form-label">Mã số sinh viên</label>
                                    <div class="col-sm-10">
                                      <input type="text" class="form-control" id="inputId" value="16110311" placeholder="Mã số sinh viên">
                                    </div>
                                  </div>
                                <div class="form-group row">
                                  <label for="inputName" class="col-sm-2 col-form-label"> Họ tên sinh viên</label>
                                  <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputName" value="Nguyễn Thành Đồng" placeholder="Nguyễn Văn A">
                                  </div>
                                </div>
                                  <div class="form-group row">
                                    
                                      <label for="inputName" class="col-sm-2 col-form-label"> Mã lớp </label>
                                      <div class="col-sm-10">
                                      <div class="input-group">
                                          <input type="text" class="form-control" placeholder="ID of Subject" value="WED1122_ST4" aria-label="Recipient's username" aria-describedby="basic-addon2">
                                          <div class="input-group-append">
                                            <button type="button" class="input-group-text px-2 bg-info" data-toggle="modal" data-target="#modalListSubject"> Chọn lớp </button>
                                          </div>
                                        </div>
                                      </div>
                                      <!-- <div class="col-sm-10">
                                         
                                      </div> -->
                                    </div>
                                    <div class="form-group row">
                                        <label for="inputName" class="col-sm-2 col-form-label"> Tên lớp </label>
                                        <div class="col-sm-10">
                                          <input type="text" class="form-control disab" id="inputName" value="Lập trình Web ST7 1-5 2018-2019" placeholder="Tên lớp">
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