<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--/ Banner-->
<!--Feature-->
<t:WrapperQuiz>

	<section id="feature" class="section-padding"
		style="background: #DDDDDD;">
		<div class="container">
			<div class="row ">
				<div class="alert alert-primary" role="alert">
					<p class="big-text" style="">Danh Sách Môn Thi Sắp Tới Của Bạn</p>
				</div>
				<div class="col">

					<!-- Default unchecked -->
					<div class="row justify-content-start">
						<c:forEach items="${lsExam}" var="item1">
							<div class="col-md-3 col-12">
								<div class="price-table pt-bg-black">
									<div>
										<span>${item1.getSubjectObject().getSubjectName()}</span>
										<span>${item1.name}</span>
									</div>
									<ul>
										<li>Kiểm tra ${item1.limitTime} phút</li>
										<li>Thời gian:${item1.timeStarting}</li>
										<li>Trắc nghiệm:${item1.numQuestions}</li>
									</ul>
									<a href="${pageContext.request.contextPath}/TestOn?id=${item1.id}">Thi</a>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>


				<!-- Default unchecked -->



			</div>
		</div>

	</section>

</t:WrapperQuiz>


