<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/header.jspf" %>

<form method="post" action='<c:url value="/exp/editExperience/${experienceModel.id}"/>'>
    <!-- Page Content-->
    <div class="container-fluid">
        <!-- Experience-->
        <section class="resume-section" id="experience">
            <div class="resume-section-content">
                <h2 class="mb-5">Edit Experience</h2>
                <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                    <div class="form-group row">
                        <label class="col-2 col-form-label">Stanowisko</label>
                        <div class="col-10">
                            <input class="form-control" type="text" name="position" value="${experienceModel.position}"
                                   placeholder="uzupełnij stanowisko">
                        </div>


                        <label class="col-2 col-form-label">Firma</label>
                        <div class="col-10">
                            <input class="form-control" type="text" name="company" value="${experienceModel.company}"
                                   placeholder="uzupełnij nazwe firmy">
                        </div>


                        <fmt:formatDate var="formattedDateStart" value="${experienceModel.dateStart}"
                                        pattern="yyyy-MM-dd"/>

                        <label class="col-2 col-form-label">Data rozpoczęcia pracy</label>
                        <div class="col-10">
                            <input type="date" value="${formattedDateStart}" name="dateStart">
                        </div>


                        <fmt:formatDate var="formattedDateEnd" value="${experienceModel.dateEnd}" pattern="yyyy-MM-dd"/>
                        <label class="col-2 col-form-label">Data zakończenia pracy</label>
                        <div class="col-10">
                            <input type="date" value="${formattedDateEnd}" name="dateEnd">
                        </div>


                        <label class="col-2 col-form-label">Zakres obowiązków</label>
                        <div class="col-10">
                                    <textarea class="form-control" rows="5" name="description"
                                              placeholder="opis stanowiska">${experienceModel.description}</textarea>
                        </div>


                        <input class="btn btn-success pull-left" type="submit" value="Zapisz"/>

</form>
<div class="resume-section-content">
<div class="d-flex flex-column flex-md-row justify-content-between mb-5">
    <div class="form-group row">

        <form method="post" action="<c:url value="/exp/deleteExperience/${experienceModel.id}"/>">
            <input class="btn btn-danger pull-left" type="submit" value="Usuń"/>
        </form>
    </div>
</div>
</div>

</div>
</div>
</div>
</section>

</div>


<%@include file="../dynamic/footer.jspf" %>
</body>
</html>