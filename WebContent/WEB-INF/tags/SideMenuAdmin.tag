<%@ tag language="java" pageEncoding="UTF-8"%>
<div class="sidebar" data-color="blue" data-active-color="danger">

	<div class="logo">
		<a href="http://www.creative-tim.com" class="simple-text logo-mini">
			<div class="logo-image-small">
				<img src="${pageContext.request.contextPath}/assets/img/logo-small.png">
			</div>
		</a> <a href="http://www.facebook.com" class="simple-text logo-normal">
			Group 2 </a>
	</div>
	<div class="sidebar-wrapper">
		<ul class="nav">
			<li><a href="#"> <i class="nc-icon nc-bank"></i> Trang chủ
			</a></li>
			<li>
				<a href="./notifications.jsp"> 
					<i class="nc-icon nc-bell-55"></i> Thông báo
				</a>
			</li>
			<li><a href="./profile.jsp"> <i
					class="nc-icon nc-single-02"></i> Hồ sơ
			</a></li>
			<li><a href="./listQuestion.jsp"> <i
					class="nc-icon nc-tile-56"></i> Câu hỏi
			</a></li>



			<li><a href="./addExam.jsp"> <i class="nc-icon nc-diamond"></i>
					Đề Thi
			</a></li>
			<li><a href="./ManageExam.jsp"> <i class="nc-icon nc-pin-3"></i>
					Quản Lý Đề Thi
			</a></li>
			<!-- End Đề thi -->


			<!-- Sinh viên -->

			<li>
				<a href="./listStudent.jsp"> 
					<i class="nc-icon nc-tile-56"></i> Sinh viên
				</a>
			</li>
			<li><a href="./listSubject.jsp"> <i
					class="nc-icon nc-briefcase-24"></i> Lớp học
			</a></li>
			<li><a href="#"> <i class="nc-icon nc-pin-3"></i> Đăng Xuất
			</a></li>

		</ul>
	</div>
</div>