<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:WrapperAdmin>
<div class="row">
	<form class="col-md-12" action="/WebThi/AddQuestion" method ="post">
		<div class="card">
			<div class="card-header">
				<div class="row">
					<div class="col-md-6">
						<h3 class="card-title">
							<b> Thêm câu hỏi mới </b>
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
								<select class="custom-select" id="inputGroupSelect01" name="categories">
									<option selected>Lĩnh vực...</option>
									<c:forEach items="${ lstCategory }" var="item"> 
									   <option value="${item.getId()}"> ${item.getCategoryName() }</option>
									</c:forEach>
									

								</select>
							</div>
						</div>

						<p>
							<b> Nội dung câu hỏi </b>
						</p>
						<textarea class="form-control p-2 my-2" rows="5" name="question"
							style="max-height: 400px"></textarea>
						<p>
							<b>Mức độ</b>
						</p>

						<div class="input-group">
							<div class="input-group-text"
								style="border: none; background: none" >
								
								<input type="radio" name="radLevel" class="ml-2 mr-1" 
									aria-label="Radio button for following text input" value="de"> Dễ
								<input type="radio" name="radLevel" class="ml-2 mr-1" 
									aria-label="Radio button for following text input" value="tb">
								Trung bình <input type="radio" name="radLevel" class="ml-2 mr-1"
									aria-label="Radio button for following text input" value="kh"> Khó
							</div>
						</div>
					</div>
					<hr>
					<div class="card-footer">
						<div class="input-group-text"
							style="border: none; background: none">
							<input type="checkbox" name="radAns" class="mr-2"
								aria-label="Radio button for following text input"> Kích
							hoạt
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
							<ul class="nav flex-column" name="listAnswer">
								<li class="nav-item">
									<div class="input-group-text">
										<input type="radio" name="radAns1" class="mr-2"
											aria-label="Radio button for following text input"> <input
											type="text" class="form-control"
											aria-label="Text input with radio button">
									</div>
								</li>
								<li class="nav-item">
									<div class="input-group-text">
										<input type="radio" name="radAns2" class="mr-2"
											aria-label="Radio button for following text input"> <input
											type="text" class="form-control"
											aria-label="Text input with radio button">
									</div>
								</li>
								<li class="nav-item">
									<div class="input-group-text">
										<input type="radio" name="radAns3" class="mr-2"
											aria-label="Radio button for following text input"> <input
											type="text" class="form-control"
											aria-label="Text input with radio button">
									</div>
								</li>
								<li class="nav-item">
									<div class="input-group-text">
										<input type="radio" name="radAns4" class="mr-2"
											aria-label="Radio button for following text input"> <input
											type="text" class="form-control"
											aria-label="Text input with radio button">
									</div>
								</li>
							</ul>
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
			<button type="submit" class="btn btn-info col-3" >
				<i class="fa fa-save"></i> Lưu thay đổi
			</button>
			
			<button class="btn btn-danger col-3">
				<i class="fa fa-times"></i> Hủy
			</button>
		</div>
	
	
</form>
</div>
</t:WrapperAdmin>
