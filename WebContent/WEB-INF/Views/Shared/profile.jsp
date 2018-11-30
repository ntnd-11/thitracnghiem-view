<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:WrapperAdmin>

        <!-- Modal Change Password-->
        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
          <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <form>
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle"> Thay đổi mật khẩu</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                  
                      <div class="form-group row">
                        <label for="inputEmail3" class="col-sm-3 col-form-label">Mật khẩu cũ</label>
                        <div class="col-sm-9">
                          <input type="password" class="form-control" id="inputEmail3" placeholder="Mật khẩu cũ">
                        </div>
                      </div>
                      <div class="form-group row">
                        <label for="inputPassword3" class="col-sm-3 col-form-label">Mật khẩu mới</label>
                        <div class="col-sm-9">
                          <input type="password" class="form-control" id="inputPassword3" placeholder="Mật khẩu">
                        </div>
                      </div>
                      <div class="form-group row">
                          <label for="inputPassword3" class="col-sm-3 col-form-label">Xác nhận mật khẩu</label>
                          <div class="col-sm-9">
                            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
                          </div>
                        </div>
                      
                      
                    
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                <button type="submit" class="btn btn-primary">Lưu thay đổi</button>
              </div>
            </form>
            </div>
          </div>
        </div>


        <div class="row">
          <div class="col-md-4">
            <div class="card card-user">
              <div class="image">
                <img src="../assets/img/damir-bosnjak.jpg" alt="...">
              </div>
              <div class="card-body">
                <div class="author">
                  <a href="#">
                    <img class="avatar border-gray" src="../assets/img/mike.jpg" alt="...">
                    <h5 class="title">Nguyễn Thành Đồng</h5>
                  </a>
                  <p class="description">
                    fullsuper98@gmail.com
                  </p>
                </div>
                <p class="description text-center">
                  "Tôi là một người khá kín đáo và nghiêm túc trong công việc"
                </p>
              </div>
              <div class="card-footer">
                <hr>
                <div class="button-container">
                  <div class="row">
                    <div class="col-lg-3 col-md-6 col-6 ml-auto">
                      <h5>12
                        <br>
                        <small>Files</small>
                      </h5>
                    </div>
                    <div class="col-lg-4 col-md-6 col-6 ml-auto mr-auto">
                      <h5> 26
                        <br>
                        <small>Câu hỏi</small>
                      </h5>
                    </div>
                   
                  </div>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="card-header">
                <h4 class="card-title"> Thành viên nhóm</h4>
              </div>
              <div class="card-body">
                <ul class="list-unstyled team-members">
                  <li>
                    <div class="row">
                      <div class="col-md-2 col-2">
                        <div class="avatar">
                          <img src="../assets/img/faces/ayo-ogunseinde-2.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                        </div>
                      </div>
                      <div class="col-md-7 col-7">
                        Trần Thành Đạt
                        <br />
                        <span class="text-muted">
                          <small>Offline</small>
                        </span>
                      </div>
                      <div class="col-md-3 col-3 text-right">
                        <btn class="btn btn-sm btn-outline-success btn-round btn-icon"><i class="fa fa-envelope"></i></btn>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="row">
                      <div class="col-md-2 col-2">
                        <div class="avatar">
                          <img src="../assets/img/faces/joe-gardner-2.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                        </div>
                      </div>
                      <div class="col-md-7 col-7">
                        Hồ Ngọc Sơn Hà
                        <br />
                        <span class="text-success">
                          <small>Available</small>
                        </span>
                      </div>
                      <div class="col-md-3 col-3 text-right">
                        <btn class="btn btn-sm btn-outline-success btn-round btn-icon"><i class="fa fa-envelope"></i></btn>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="row">
                      <div class="col-md-2 col-2">
                        <div class="avatar">
                          <img src="../assets/img/faces/clem-onojeghuo-2.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                        </div>
                      </div>
                      <div class="col-ms-7 col-7">
                        Phan Văn Trí
                        <br />
                        <span class="text-danger">
                          <small>Busy</small>
                        </span>
                      </div>
                      <div class="col-md-3 col-3 text-right">
                        <btn class="btn btn-sm btn-outline-success btn-round btn-icon"><i class="fa fa-envelope"></i></btn>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-md-8">
            <div class="card card-user">
              <div class="card-header">
                <h5 class="card-title"> Chỉnh sửa hồ sơ cá nhân </h5>
              </div>
              <div class="card-body">
                <form>
                  <div class="row">
                    <div class="col-md-5 pr-1">
                      <div class="form-group">
                        <label>Công ty </label>
                        <input type="text" class="form-control" disabled="" placeholder="Company" value="HCMUTE Inc.">
                      </div>
                    </div>
                    <div class="col-md-3 px-1">
                      <div class="form-group">
                        <label>Tài khoản</label>
                        <input type="text" class="form-control" placeholder="Username" value="dongnguyen98">
                      </div>
                    </div>
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                        <label for="exampleInputEmail1">Email</label>
                        <input type="email" class="form-control" placeholder="Email">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <label>Tên</label>
                        <input type="text" class="form-control" placeholder="Company" value="Đồng">
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                        <label>Họ & Tên lót</label>
                        <input type="text" class="form-control" placeholder="Last Name" value="Nguyễn Thành">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label> Địa chỉ</label>
                        <input type="text" class="form-control" placeholder="Home Address" value="01, Vo Văn Ngân">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-4 pr-1">
                      <div class="form-group">
                        <label>Thành phố</label>
                        <input type="text" class="form-control" placeholder="City" value="Hồ Chí Minh">
                      </div>
                    </div>
                    <div class="col-md-4 px-1">
                      <div class="form-group">
                        <label> Quốc tịch </label>
                        <input type="text" class="form-control" placeholder="Country" value="Việt Nam">
                      </div>
                    </div>
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                        <label>Postal Code</label>
                        <input type="number" class="form-control" placeholder="ZIP Code">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label> Giới thiệu chung</label>
                        <textarea class="form-control textarea">Oh so, your weak rhyme You doubt I'll bother, reading into it</textarea>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="update ml-auto mr-auto">
                      <button type="submit" class="btn btn-primary btn-round"> Cập nhật hồ sơ</button>
                    </div>
                    <div class="update ml-auto mr-auto">
                      <button type="button" class="btn btn-danger btn-round" data-toggle="modal" data-target="#exampleModalCenter">
                           Thay đổi mật khẩu 
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
</t:WrapperAdmin>>