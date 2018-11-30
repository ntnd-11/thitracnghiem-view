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
							<h4 class="card-title">Danh sách câu hỏi</h4>
						</div>
						
						<div class="col-md-3">
							<a class="btn btn-success" href="./addQuestion.jsp"> 
							<i class="fa fa-plus"></i> Add Question
							</a>
						</div>
						
						<div class="navbar navbar-light">
							<a class="navbar-brand"> Navbar </a>
							<form class="form-inline">
								<input class="form-control " type="search"
									placeholder="Search .." aria-label="Search">
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
								<th width="2%">
									<input type="checkbox" aria-label="Radio button for following text input"></th>
								<th width="8%">Mã</th>
								<th width="20%">Câu hỏi</th>
								<th width="20%">Câu trả lời</th>
								<th width="20%">Đáp án</th>
								<th>Ngày thêm</th>
								<th class="20%">Tùy chọn</th>
							</tr>
							</thead>
							<tr>
								<td><input type="checkbox"
									aria-label="Radio button for following text input"></td>
								<td>1</td>
								<td>C# được ra đời năm nào ?</td>
								<td>1995 <br /> 1996 <br /> 2000 <br /> 2001 <br />
								</td>
								<td>Không biết</td>
								<td>2/2/2018 15:30 GMT</td>
								<td><a href="./editQuestion.jsp" class="btn btn-warning"><i
										class="fa fa-pencil"></i></a>
									<button class="btn btn-danger" data-toggle="modal"
										data-target="#modalConfirmDeleting">
										<i class="fa fa-trash"></i>
									</button></td>
							</tr>
							<tr>
								<td><input type="checkbox"
									aria-label="Radio button for following text input"></td>
								<td>1</td>
								<td>C# được ra đời năm nào ?</td>
								<td>1995 <br /> 1996 <br /> 2000 <br /> 2001 <br />
								</td>
								<td>Không biết</td>
								<td>2/2/2018 15:30 GMT</td>
								<td><a href="./editQuestion.jsp" class="btn btn-warning"><i
										class="fa fa-pencil"></i></a>
									<button class="btn btn-danger" data-toggle="modal"
										data-target="#modalConfirmDeleting">
										<i class="fa fa-trash"></i>
									</button></td>
							</tr>
							<tr>
								<td><input type="checkbox"
									aria-label="Radio button for following text input"></td>
								<td>1</td>
								<td>C# được ra đời năm nào ?</td>
								<td>1995 <br /> 1996 <br /> 2000 <br /> 2001 <br />
								</td>
								<td>Không biết</td>
								<td>2/2/2018 15:30 GMT</td>
								<td><a href="./editQuestion.jsp" class="btn btn-warning"><i
										class="fa fa-pencil"></i></a>
									<button class="btn btn-danger" data-toggle="modal"
										data-target="#modalConfirmDeleting">
										<i class="fa fa-trash"></i>
									</button></td>
							</tr>
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