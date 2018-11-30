<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:WrapperAdmin>
	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">
					<h3 class="card-title">
						<b> Thêm lớp học </b>
					</h3>
					<div class="card-body">
						<form>
							<div class="form-group row">
								<label for="inputId" class="col-sm-2 col-form-label"> <b>Tên
										môn học</b></label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="inputId"
										placeholder="Tên môn học">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputName" class="col-sm-2 col-form-label">
									<b>Ngày trong tuần</b>
								</label>
								<div class="col-sm-4">
									<select class="custom-select">
										<option selected>Thứ 2</option>
										<option value="1">Thứ 3</option>
										<option value="2">Thứ 4</option>
										<option value="3">Thứ 5</option>
										<option value="4">Thứ 6</option>
										<option value="5">Thứ 7</option>
									</select>
								</div>
								<label for="inputName" class="col-sm-1 col-form-label">
									<b>Từ tiết</b>
								</label>
								<div class="col-sm-2">
									<input type="number" class="form-control">
								</div>
								<label for="inputName" class="col-sm-1 col-form-label">
									<b>đến</b>
								</label>
								<div class="col-sm-2">
									<input type="number" class="form-control">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputId" class="col-sm-2 col-form-label"> <b>
										Số lượng </b></label>
								<div class="col-sm-4">
									<input type="number" class="form-control" id="inputId">
								</div>
								<label for="inputId" class="col-sm-1 col-form-label"> <b>
										Phòng học </b></label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="inputId"
										placeholder="Phòng học">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputId" class="col-md-2 col-form-label"> <b>
										Ngày bắt đầu </b></label>
								<div class="col-md-4">
									<input type="date" class="form-control" id="inputId">
								</div>
								<label for="inputId" class="col-md-1 col-form-label"> <b>
										Ngày kết thúc </b></label>
								<div class="col-md-5">
									<input type="date" class="form-control" id="inputId"
										placeholder="Phòng học">
								</div>
							</div>
							<div class="form-group row">
								<label for="inputName" class="col-sm-2 col-form-label">
									Tên lớp </label>
								<div class="col-sm-10">
									<input type="text" class="form-control disab" id="inputName"
										placeholder="Tên lớp">
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>

			<div class="row justify-content-center">
				<a href="./listStudent.html" class="btn btn-info col-3"> <i
					class="fa fa-check"></i> Lưu thay đổi
				</a> <a href="./listStudent.html" class="btn btn-danger col-3"> <i
					class="fa fa-times"></i> Hủy
				</a>
			</div>

		</div>
	</div>
</t:WrapperAdmin>