<#if (Request)??>
<#include "init.ftl">
</#if>

<#if isSignedIn == false>
<div class="">
	<form action="${loginURL}" method="post" class="eq-height-lg" name="login_form">
		<input name="${portletNamespace}action" id="input_action" type="hidden"/>
		<div class="row">
			<div class="col-sm-12" style="padding-right: 15px !important;">
				<div class="">
					<span style="font-weight: bold;color: #fff;">Tài khoản đăng nhập</span>
					<input type="text" class="form-control input-sm" name="${portletNamespace}login" id="input_login" placeholder="Tài khoản đăng nhập" title="Tài khoản đăng nhập">
				</div>
			</div>
			<div class="col-sm-12" style="padding-left: 15px !important;">
				<div class="">
					<span style="font-weight: bold;color: #fff;">Mật khẩu</span>
					<input type="password" class="form-control input-sm" name="${portletNamespace}password" id="input_password" placeholder="Mật khẩu" title="Mật khẩu">
				</div>
			</div>
		</div>
		<div class="row">
			<#-- <div class="col-sm-6">
				
				<a href="/forgotten-password" class="text-hover-blue">Quên mật khẩu?</a>
				
			</div> -->
			<div class="col-sm-12" style="padding-top: 10px; text-align: center;">
				<#-- <button class="btn btn-active btn-sm" type="button" id="btn-register-applicant">Đăng ký</button> -->
				<button style="width: 42%; display: block !important;" class="btn btn-active btn-sm">Đăng nhập</button>
			</div>
			<div class="col-sm-12" style="padding-top: 10px;">
				<a href="javascript:;" id="btn-register-applicant" style="color: #fff;" class="text-hover-blue">Đăng ký?</a> <br>
				<a href="/forgotten-password" style="color: #fff;" class="text-hover-blue">Quên mật khẩu?</a> 
			</div>
		</div>
		
	</form>
</div>

<div class="visible-xs visible-sm">
	<a href="#">Đăng nhập</a>
</div>
<#else>
<div class="account-section align-middle">
	<#-- <a href="" class="notification-alert">
		<i class="fa fa-bell-o" aria-hidden="true"></i>
		<span>3</span>
	</a> -->
	<div class="account align-middle">
		<img src="https://img.icons8.com/fluent/96/000000/user-male-circle.png" class="img-rounded" style="margin-right: 8px;" />
		<div class="dropdown">
			<button class="btn btn-reset dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
				<b>${userName}</b>
				<span class="caret"></span>
			</button>
			<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
				<li><a href="/profile"><i class="fa fa-user"></i> Thông tin tài khoản</a></li>
				<li><a href="/c/portal/logout"><i class="fa fa-arrow-right"></i> Đăng xuất</a></li>
			</ul>
		</div>
	</div>
</div>
</#if>

<script type="text/javascript">
	$("#btn-register-applicant").click(function () {
		window.location.href = "/web/cong-tiep-nhan/register";
	});
</script>


<style>
	.hp .portlet-boundary_FrontendWebPortal_LoginPortlet_ form>div:nth-child(2)>div:last-child {
		padding-left: 0px !important;
	}
</style>