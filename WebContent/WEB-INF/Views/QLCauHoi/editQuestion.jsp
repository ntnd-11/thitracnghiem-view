<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:WrapperAdmin>

	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">
					<div class="row">
						<div class="col-md-6">
							<h3 class="card-title">
								<b> Chỉnh sửa câu hỏi: <i>124</i>
								</b>
								</h3>
						</div>
						<div class="col-md-3"></div>
						<div class="col-md-3 mr-0">
							<div class="input-group">
								<input type="file" class="custom-file-input"
									id="inputGroupFile04" aria-describedby="inputGroupFileAddon04">
								<label class="custom-file-label" for="inputGroupFile04">Choose
									file</label>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="card ">
						<div class="card-header ">
							<h5 class="card-title">Nội dung câu hỏi</h5>
						</div>
						<div class="card-body ">
							<div class="input-group mb-4">
								<div class="form-control" style="border: none">
									<p>
										<b>Lĩnh vực</b>
									</p>
									<select class="custom-select" id="inputGroupSelect01">
										<option value="0">Lĩnh vực...</option>
										<option value="1">Toán</option>
										<option selected value="2">Tin</option>
										<option value="3">Giải thuật</option>
									</select>
								</div>
							</div>

							<p>
								<b> Nội dung câu hỏi </b>
							</p>
							<textarea class="form-control p-2 my-2" rows="5"
								style="max-height: 400px">C# ra đời vào năm bao nhiêu
                    </textarea>
							<p>
								<b>Mức độ</b>
							</p>

							<div class="input-group">
								<div class="input-group-text"
									style="border: none; background: none">
									<input type="radio" name="radLevel" class="ml-2 mr-1"
										aria-label="Radio button for following text input"> Dễ
									<input type="radio" checked="checked" name="radLevel"
										class="ml-2 mr-1"
										aria-label="Radio button for following text input">
									Trung bình <input type="radio" name="radLevel"
										class="ml-2 mr-1"
										aria-label="Radio button for following text input">
									Khó
								</div>
							</div>
						</div>
						<hr>
						<div class="card-footer">
							<div class="input-group-text"
								style="border: none; background: none">
								<input type="checkbox" checked="checked" radAns" class="mr-2"
									aria-label="Radio button for following text input">
								Kích hoạt
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-8">
					<div class="card card-chart">
						<div class="card-header">
							<h5 class="card-title">Danh sách câu trả lời</h5>
							<p class="card-category">Chọn 1 đáp án đúng</p>
						</div>
						<div class="card-body">
							<form>
								<ul class="nav flex-column" name="listAnswer">
									<li class="nav-item">
										<div class="input-group-text">
											<input type="radio" name="radAns" class="mr-2"
												aria-label="Radio button for following text input">
											<input type="text" class="form-control"
												aria-label="Text input with radio button" value="2000">
										</div>
									</li>
									<li class="nav-item">
										<div class="input-group-text">
											<input type="radio" checked="checked" name="radAns"
												class="mr-2"
												aria-label="Radio button for following text input">
											<input type="text" class="form-control"
												aria-label="Text input with radio button" value="2001">
										</div>
									</li>
									<li class="nav-item">
										<div class="input-group-text">
											<input type="radio" name="radAns" class="mr-2"
												aria-label="Radio button for following text input">
											<input type="text" class="form-control"
												aria-label="Text input with radio button" value="1995">
										</div>
									</li>
									<li class="nav-item">
										<div class="input-group-text">
											<input type="radio" name="radAns" class="mr-2"
												aria-label="Radio button for following text input">
											<input type="text" class="form-control"
												aria-label="Text input with radio button" value="1994">
										</div>
									</li>
								</ul>
							</form>
						</div>
						<div class="card-footer">
							<hr />
							<div class="card-stats">
								<button class="col-md-12 btn btn-success">
									<i class="fa fa-plus"></i> Thêm câu trả lời
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row justify-content-center">
				<a href="./listQuestion.html" class="btn btn-info col-3"> <i
					class="fa fa-save"></i> Lưu thay đổi
				</a> <a href="./listQuestion.html" class="btn btn-danger col-3"> <i
					class="fa fa-times"></i> Hủy
				</a>
			</div>
		</div>
	</div>
</t:WrapperAdmin>