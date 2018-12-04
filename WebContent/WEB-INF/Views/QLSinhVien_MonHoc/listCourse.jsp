<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:WrapperAdmin>
	<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-header">
					<div class="row">
						<div class="col-md-3">
							<h4 class="card-title">Danh sách Môn Học</h4>
						</div>
						<div class="col-md-3">
							<a class="btn btn-success" href="./addSubject.jsp"> <i
								class="fa fa-plus"></i> Mở lớp
							</a>
						</div>
						<div class="navbar navbar-light">
							<form class="form-inline">
								<input class="form-control " type="search"
									placeholder="Tìm kiếm .." aria-label="Search">
								<button class="btn btn-outline-success  py-2 my-sm-0"
									type="submit">
									<i class="fa fa-search"></i>
								</button>
							</form>
						</div>
					</div>
				</div>
				<div class="card-body">

					<div class="table-responsive">
						<table class="table">
							<thead class=" text-primary">
							<tr>
								<th width="2px"><input type="checkbox"
									aria-label="Radio button for following text input"></th>
								<th width="4px">Mã</th>
								<th>Tên lớp</th>

								<th width="15%">Môn học</th>
								<th width="10%">Thời gian</th>

								<th width="10%">Bắt đầu</th>
								<th width="10%">Kết thúc</th>
								<th class="20%">Tùy chọn</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input type="checkbox"
										aria-label="Radio button for following text input"></td>
									<td>1</td>
									<td>Lập Trình Web ST7 1-5 2018-2019</td>
									<td>Lập trình Web</td>
									<td>Tiết 1 - 5 Thứ 7</td>
									<td>28/8/2/2018</td>
									<td>15/12/2018</td>
									<td><a href="./editSubject.jsp" class="btn btn-warning"><i
											class="fa fa-pencil"></i></a>
										<button class="btn btn-danger" data-toggle="modal"
											data-target="#modalConfirmDeleting">
											<i class="fa fa-trash"></i>
										</button></td>
								</tr>
								<tr>
								<tr>
									<td><input type="checkbox"
										aria-label="Radio button for following text input"></td>
									<td>1</td>
									<td>Lập Trình Web ST7 1-5 2018-2019</td>
									<td>Lập trình Web</td>
									<td>Tiết 1 - 5 Thứ 7</td>
									<td>28/8/2/2018</td>
									<td>15/12/2018</td>
									<td><a href="./editSubject.jsp" class="btn btn-warning"><i
											class="fa fa-pencil"></i></a>
										<button class="btn btn-danger" data-toggle="modal"
											data-target="#modalConfirmDeleting">
											<i class="fa fa-trash"></i>
										</button></td>
								</tr>
								<tr>
								<tr>
									<td><input type="checkbox"
										aria-label="Radio button for following text input"></td>
									<td>1</td>
									<td>Lập Trình Web ST7 1-5 2018-2019</td>
									<td>Lập trình Web</td>
									<td>Tiết 1 - 5 Thứ 7</td>
									<td>28/8/2/2018</td>
									<td>15/12/2018</td>
									<td><a href="./editSubject.jsp" class="btn btn-warning"><i
											class="fa fa-pencil"></i></a>
										<button class="btn btn-danger" data-toggle="modal"
											data-target="#modalConfirmDeleting">
											<i class="fa fa-trash"></i>
										</button></td>
								</tr>
								<tr>
							</tbody>
						</table>
						<nav aria-label="Page navigation example">
							<ul class="pagination justify-content-center">
								<li class="page-item disabled"><a class="page-link"
									href="#" tabindex="-1">Previous</a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item"><a class="page-link" href="#">2</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Next</a>
								</li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>

	</div>
</t:WrapperAdmin>