<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Calculo IMC</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="scripts/master.js"></script>
</head>

<body>
    <div class="col-md-12">
        <div class="modal-dialog" style="margin-bottom:0">
            <div class="modal-content">
                <div class="panel-heading">
                    <h1 class="panel-title">Calculo IMC</h1>
                </div>
                <div class="panel-body">
                    <form name="formulario">
                        <fieldset>
                            <div class="form-group">
                                <label for="sel1">Height:</label>
                                <div class="input-group input-group-lg">

                                    <span class="input-group-addon" id="sizing-addon1">Meters</span>
                                    <input type="text" class="form-control" placeholder="Height" aria-describedby="sizing-addon1" name="height">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="sel1">Weight:</label>
                                <div class="input-group input-group-lg">

                                    <span class="input-group-addon" id="sizing-addon1">Kilograms</span>
                                    <input type="text" class="form-control" placeholder="Weight" aria-describedby="sizing-addon1" name="weight">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="sex">Select Sex:</label>
                                <select class="form-control" id="sex">
                              <option>Male</option>
                              <option>Female</option>
                            </select>
                            </div>
                            <button class="btn btn-sm btn-success" type="button" onclick="calcular()">Calcular</a>
                        </fieldset>
                </form>
            </div>
        </div>
    </div>
  </body>
</html>
