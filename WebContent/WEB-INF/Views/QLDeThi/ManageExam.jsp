<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<t:WrapperAdmin>

	<div class="row justify-content-center">
		<div class="col-md-10  ">
			<div class="card card-user">
				<div class="card-header">
					<h5 class="card-title">Danh Sách Câu Hỏi</h5>
				</div>
				<div class="card-body">
					<div class="col">
						<div class="row">
							<div class="mr-auto">
								<a href="#" class="btn btn-info " role="button">Thêm Đề Thi
									&#x2b; </a>
							</div>

							<div class="ml-auto">
								<form class="form">

									<div class="col">
										<div class="input-group mb-3">
											<input class="form-control " type="number"
												placeholder="Search .." aria-label="Search"
												data-toggle="collapse" data-target="#demo"
												name="characterSearch">
											<div class="input-group-append">
												<button class="btn btn-outline-success  py-2 my-sm-0"
													type="submit">
													<i class="fa fa-search"></i>
												</button>
											</div>
										</div>

									</div>



								</form>

							</div>
						</div>
						
						<select multiple class="form-control mb-4" name="sellist2"
							id="resultSearch" hidden="hidden">
							<option selected>Result</option>
						</select>
					</div>
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr class="col-md-12 text-center">
									<th>Mã Đề</th>
									<th>Thời Gian BD Thi</th>
									<th>Thời Gian KT Thi</th>
									<th>Môn Học</th>
									<th>Số Câu Hỏi</th>
									<th class="text-center">Lựa Chọn</th>
								</tr>
							</thead>
							<tbody id="tableBody">
								<c:forEach items="${list}" var="item">
									<tr class="text-center">
										<td>${item.id}</td>
										<td>${item.timeStarting}</td>
										<td>${item.timeFinishing}</td>
										<td>${item.subjectObject.subjectName}</td>
										<td>${item.numQuestions}</td>
										<td><a href="#"><i class="fa fa-edit float-right"
												style="font-size: 36px"></i></a> <a href="#"><i
												class="fa fa-trash-o float-left" style="font-size: 36px"></i></a>
										</td>
									</tr>
								</c:forEach>


							</tbody>
						</table>
					</div>

					<nav aria-label="Page navigation example" class="float-right">
						<ul class="pagination">
							<li class="page-item"><a class="page-link" href="#">Previous</a></li>
							<c:forEach var="i" begin="1" end="${numberPage}">
								<li class="page-item"><a class="page-link"
									href="${pageContext.request.contextPath}/ListExam?page=${i}">${i}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">Next</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function searchResult(character) {

			
		$
					.ajax({
						url : '${pageContext.request.contextPath}/SearchListExam',
						data : {
							character : character
						},
						dataType : 'html',
						success : function(data) {
							var obj = $.parseJSON(data);
							console.log(obj);
							$
									.each(
											obj,
											function(index, el) {
												$(
														"<option>"
																+ el.id
																+ "---"
																+ el.timeStarting
																+ "---"
																+ el.timeFinishing
																+ "---"
																+ el.courseObject.subjectIdObject.subjectName
																+ "</option>")
														.appendTo(
																$("#resultSearch"));
											});
						}
					});
			$("#resultSearch").removeAttr("hidden")
		}
		$(document).ready(function() {
			$('[name="characterSearch"]').keyup(function(event) {
				if (!$(this).val())
					$("#resultSearch").attr("hidden");
				else {
					$("#resultSearch").empty();
					searchResult($(this).val());
				}
			});
		});
	</script>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<t:WrapperAdmin>

	<div class="row justify-content-center">
		<div class="col-md-10  ">
			<div class="card card-user">
				<div class="card-header">
					<h5 class="card-title">Danh Sách Câu Hỏi</h5>
				</div>
				<div class="card-body">
					<div class="col">
						<div class="row">
							<div class="mr-auto">
								<a href="#" class="btn btn-info " role="button">Thêm Đề Thi
									&#x2b; </a>
							</div>

							<div class="ml-auto">
								<form class="form">

									<div class="col">
										<div class="input-group mb-3">
											<input class="form-control " type="number"
												placeholder="Search .." aria-label="Search"
												data-toggle="collapse" data-target="#demo"
												name="characterSearch">
											<div class="input-group-append">
												<button class="btn btn-outline-success  py-2 my-sm-0"
													type="submit">
													<i class="fa fa-search"></i>
												</button>
											</div>
										</div>

									</div>



								</form>

							</div>
						</div>
						
						<select multiple class="form-control mb-4" name="sellist2"
							id="resultSearch" hidden="hidden">
							<option selected>Result</option>
						</select>
					</div>
					<div class="table-responsive">
						<table class="table">
							<thead>
								<tr class="col-md-12 text-center">
									<th>Mã Đề</th>
									<th>Thời Gian BD Thi</th>
									<th>Thời Gian KT Thi</th>
									<th>Môn Học</th>
									<th>Số Câu Hỏi</th>
									<th class="text-center">Lựa Chọn</th>
								</tr>
							</thead>
							<tbody id="tableBody">
								<c:forEach items="${list}" var="item">
									<tr class="text-center">
										<td>${item.id}</td>
										<td>${item.timeStarting}</td>
										<td>${item.timeFinishing}</td>
										<td>${item.name}</td>
										<td>${item.numQuestions}</td>
										<td><a href="${pageContext.request.contextPath}/EditExams?command=update&id=${item.id}"><i class="fa fa-edit float-right"
												style="font-size: 36px"></i></a>
												 <a href="${pageContext.request.contextPath}/EditExams?command=delete&id=${item.id}"><i
												class="fa fa-trash-o float-left" style="font-size: 36px"></i></a>
										</td>
									</tr>
								</c:forEach>


							</tbody>
						</table>
					</div>

					<nav aria-label="Page navigation example" class="float-right">
						<ul class="pagination">
							<li class="page-item"><a class="page-link" href="#">Previous</a></li>
							<c:forEach var="i" begin="1" end="${numberPage}">
								<li class="page-item"><a class="page-link"
									href="${pageContext.request.contextPath}/ListExam?page=${i}">${i}</a></li>
							</c:forEach>
							<li class="page-item"><a class="page-link" href="#">Next</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function searchResult(character) {

			
		$
					.ajax({
						url : '${pageContext.request.contextPath}/SearchListExam',
						data : {
							character : character
						},
						dataType : 'html',
						success : function(data) {
							var obj = $.parseJSON(data);
							console.log(obj);
							$
									.each(
											obj,
											function(index, el) {
												$(
														"<option>"
																+ el.id
																+ "---"
																+ el.timeStarting
																+ "---"
																+ el.timeFinishing
																+ "---"
																+ el.courseObject.subjectIdObject.subjectName
																+ "</option>")
														.appendTo(
																$("#resultSearch"));
											});
						}
					});
			$("#resultSearch").removeAttr("hidden")
		}
		$(document).ready(function() {
			$('[name="characterSearch"]').keyup(function(event) {
				if (!$(this).val())
					$("#resultSearch").attr("hidden");
				else {
					$("#resultSearch").empty();
					searchResult($(this).val());
				}
			});
		});
	</script>
>>>>>>> 8f40102d5dab577a2fe25fff6221cca96e6598d0
</t:WrapperAdmin>