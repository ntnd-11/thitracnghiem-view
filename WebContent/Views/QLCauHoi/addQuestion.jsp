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
    Thêm Câu Hỏi Mới
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
    <jsp:include page="SideMenuQLCauHoi.jsp"></jsp:include>  
    <div class="main-panel">
      <!-- Navbar -->
     <!---Navbar chèn tại đây-->
     <jsp:include page="NavBarQLCauHoi.jsp"></jsp:include>  
      <!-- End Navbar -->
      <!-- <div class="panel-header panel-header-sm">


</div> -->
        <div class="content">
        <div class="row">
        	 <div class="col-md-12">
                <div class="card">
                  <div class="card-header">
                    <div class="row">
                      <div class="col-md-6">
                          <h3 class="card-title"><b> Thêm câu hỏi mới </b> </h4>
                      </div>
                      <div class="col-md-3" >
                      </div>
                      <div class="col-md-3 mr-0" >
                          <div class="input-group">
                                <input type="file" class="custom-file-input" id="inputGroupFile04" aria-describedby="inputGroupFileAddon04">
                                <label class="custom-file-label" for="inputGroupFile04">Choose file</label>
                            </div>
                  </div>
                </div>
              </div>
        </div>
        <div class="row">
          <div class="col-md-4">
            <div class="card ">
              <div class="card-header ">
                <h5 class="card-title"> Nội dung câu hỏi</h5>
              </div>
              <div class="card-body ">
                  <div class="input-group mb-4">
                      <div class="form-control" style="border:none">
                        <p><b>Lĩnh vực</b></p>
                        <select class="custom-select" id="inputGroupSelect01">
                          <option selected> Lĩnh vực...</option>
                          <option value="1">Toán</option>
                          <option value="2">Tin</option>
                          <option value="3">Giải thuật</option>
                        </select>
                      </div>
                    </div>

                    <p> <b> Nội dung câu hỏi </b> </p>
                    <textarea class="form-control p-2 my-2" rows="5" style="max-height:400px"></textarea>
                    <p> <b>Mức độ</b> </p>

                    <div class="input-group">
                      <div class="input-group-text" style="border:none;background:none">
                          <input type="radio" name="radLevel" class="ml-2 mr-1" aria-label="Radio button for following text input">
                          Dễ
                          <input type="radio" name="radLevel" class="ml-2 mr-1" aria-label="Radio button for following text input">
                          Trung bình
                          <input type="radio" name="radLevel" class="ml-2 mr-1" aria-label="Radio button for following text input">
                          Khó
                      </div>
                  </div>
              </div>
              <hr>
              <div class="card-footer">
                  <div class="input-group-text" style="border:none;background:none">
                      <input type="checkbox" name="radAns" class="mr-2" aria-label="Radio button for following text input">
                      Kích hoạt
                  </div>                  
              </div>
            </div>
          </div>
          <div class="col-md-8">
            <div class="card card-chart">
              <div class="card-header">
                <h5 class="card-title">Danh sách câu trả lời</h5>
                <p class="card-category"> Chọn 1 đáp án đúng</p>
              </div>
              <div class="card-body">
                <form>
                <ul class="nav flex-column" name="listAnswer">
                  <li class="nav-item">
                        <div class="input-group-text">
                          <input type="radio" name="radAns" class="mr-2" aria-label="Radio button for following text input">
                          <input type="text" class="form-control" aria-label="Text input with radio button">
                        </div>
                  </li>
                  <li class="nav-item">
                      <div class="input-group-text">
                        <input type="radio" name="radAns" class="mr-2" aria-label="Radio button for following text input">
                        <input type="text" class="form-control" aria-label="Text input with radio button">
                      </div>
                </li>
                  <li class="nav-item">
                      <div class="input-group-text">
                        <input type="radio" name="radAns" class="mr-2" aria-label="Radio button for following text input">
                        <input type="text" class="form-control" aria-label="Text input with radio button">
                      </div>
                  </li>
                  <li class="nav-item">
                      <div class="input-group-text">
                        <input type="radio"  name="radAns" class="mr-2" aria-label="Radio button for following text input">
                        <input type="text" class="form-control" aria-label="Text input with radio button">
                      </div>
                </li>
                </ul>
              </form>
              </div>
              <div class="card-footer">
                <hr/>
                <div class="card-stats">
                  <button class="col-md-12 btn btn-success"> <i class="fa fa-plus"></i> Thêm câu trả lời</button>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row justify-content-center">
          <button class="btn btn-info col-3"> <i class="fa fa-save"></i> Lưu thay đổi</button>
          <button class="btn btn-danger col-3"> <i class="fa fa-times"></i> Hủy </button>
        </div>
  </div>
        </div>
              <jsp:include page="FooterQLCauHoi.jsp"></jsp:include>  
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