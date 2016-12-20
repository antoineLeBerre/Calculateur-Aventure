package com.sf.alb.calculateurav;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculAventure extends ActionBarActivity implements View.OnClickListener {

    TextView mExpUn;
    TextView mExpDeux;
    TextView mExpTrois;
    TextView rentUn;
    TextView rentDeux;
    TextView rentTrois;
    EditText minUn;
    EditText secUn;
    EditText orUn;
    EditText argentUn;
    EditText orObjUn;
    EditText argObjUn;
    EditText expUn;
    EditText minDeux;
    EditText secDeux;
    EditText orDeux;
    EditText argentDeux;
    EditText orObjDeux;
    EditText argObjDeux;
    EditText expDeux;
    EditText minTrois;
    EditText secTrois;
    EditText orTrois;
    EditText argentTrois;
    EditText orObjTrois;
    EditText argObjTrois;
    EditText expTrois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventires);
        minUn = (EditText) findViewById(R.id.minute);
        secUn = (EditText) findViewById(R.id.seconde);
        orUn = (EditText) findViewById(R.id.or);
        argentUn = (EditText) findViewById(R.id.argent);
        orObjUn = (EditText) findViewById(R.id.orObjAv1);
        argObjUn = (EditText) findViewById(R.id.argentObjAv1);
        expUn = (EditText) findViewById(R.id.editTextExp1);
        minDeux = (EditText) findViewById(R.id.editMinAv2);
        secDeux = (EditText) findViewById(R.id.editSecAv2);
        orDeux = (EditText) findViewById(R.id.editOrAv2);
        argentDeux = (EditText) findViewById(R.id.editArgentAv2);
        orObjDeux = (EditText) findViewById(R.id.orObjAv2);
        argObjDeux = (EditText) findViewById(R.id.argentObjAv2);
        expDeux = (EditText) findViewById(R.id.editExpAv2);
        minTrois = (EditText) findViewById(R.id.editMinAv3);
        secTrois = (EditText) findViewById(R.id.editSecAv3);
        orTrois = (EditText) findViewById(R.id.editOrAv3);
        argentTrois = (EditText) findViewById(R.id.editArgentAv3);
        orObjTrois = (EditText) findViewById(R.id.orObjAv3);
        argObjTrois = (EditText) findViewById(R.id.argObjAv3);
        expTrois = (EditText) findViewById(R.id.editExpAv3);
        Button boutonOk = (Button) findViewById(R.id.buttonOk);
        Button boutonReset = (Button) findViewById(R.id.buttonReset);
        boutonOk.setOnClickListener(this);
        boutonReset.setOnClickListener(this);
        mExpUn = (TextView) findViewById(R.id.expU);
        mExpDeux = (TextView) findViewById(R.id.mExpAv2);
        mExpTrois = (TextView) findViewById(R.id.mExpAv3);
        rentUn = (TextView) findViewById(R.id.rentAv1);
        rentDeux = (TextView) findViewById(R.id.rentAv2);
        rentTrois = (TextView) findViewById(R.id.rentAv3);
        mExpUn.setVisibility(View.INVISIBLE);
        mExpDeux.setVisibility(View.INVISIBLE);
        mExpTrois.setVisibility(View.INVISIBLE);
        rentUn.setVisibility(View.INVISIBLE);
        rentDeux.setVisibility(View.INVISIBLE);
        rentTrois.setVisibility(View.INVISIBLE);
    }

    public void onClick (View v)
    {
        String varMinUn;
        String varSecUn;
        String varOrUn;
        String varArgentUn;
        String varOrObjUn;
        String varArgObjUn;
        String varExpUn;
        String varMinDeux;
        String varSecDeux;
        String varOrDeux;
        String varArgentDeux;
        String varOrObjDeux;
        String varArgObjDeux;
        String varExpDeux;
        String varMinTrois;
        String varSecTrois;
        String varOrTrois;
        String varOrObjTrois;
        String varArgObjTrois;
        String varArgentTrois;
        String varExpTrois;
        switch (v.getId())
        {
            case R.id.buttonOk:

                varMinUn = minUn.getText().toString();
                varSecUn = secUn.getText().toString();
                varOrUn = orUn.getText().toString();
                varArgentUn = argentUn.getText().toString();
                varOrObjUn = orObjUn.getText().toString();
                varArgObjUn = argObjDeux.getText().toString();
                varExpUn = expUn.getText().toString();
                varMinDeux = minDeux.getText().toString();
                varSecDeux = secDeux.getText().toString();
                varOrDeux = orDeux.getText().toString();
                varArgentDeux = argentDeux.getText().toString();
                varOrObjDeux = orObjDeux.getText().toString();
                varArgObjDeux = argObjDeux.getText().toString();
                varExpDeux = expDeux.getText().toString();
                varMinTrois = minTrois.getText().toString();
                varSecTrois = secTrois.getText().toString();
                varOrTrois = orTrois.getText().toString();
                varArgentTrois = argentTrois.getText().toString();
                varOrObjTrois = orObjTrois.getText().toString();
                varArgObjTrois = argObjTrois.getText().toString();
                varExpTrois = expTrois.getText().toString();
                mExpUn.setVisibility(View.INVISIBLE);
                mExpDeux.setVisibility(View.INVISIBLE);
                mExpTrois.setVisibility(View.INVISIBLE);
                rentUn.setVisibility(View.INVISIBLE);
                rentDeux.setVisibility(View.INVISIBLE);
                rentTrois.setVisibility(View.INVISIBLE);
                if ((varMinUn.matches("") && varSecUn.matches("")) ||
                        (varMinDeux.matches("") && varSecDeux.matches("")) ||
                        (varMinTrois.matches("") && varSecTrois.matches("")))
                {
                    Toast.makeText(this, "Le champ Minute et Seconde sont vides", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    if (varMinUn.matches(""))
                    {
                        minUn.setText("0");
                        varMinUn = minUn.getText().toString();
                    }
                    if (varSecUn.matches(""))
                    {
                        secUn.setText("0");
                        varSecUn = secUn.getText().toString();
                    }
                    if (varMinDeux.matches(""))
                    {
                        minDeux.setText("0");
                        varMinDeux = minDeux.getText().toString();
                    }
                    if (varSecDeux.matches(""))
                    {
                        secDeux.setText("0");
                        varSecDeux = secDeux.getText().toString();
                    }
                    if (varMinTrois.matches(""))
                    {
                        minTrois.setText("0");
                        varMinTrois = minTrois.getText().toString();
                    }
                    if (varSecTrois.matches(""))
                    {
                        secTrois.setText("0");
                        varSecTrois = secTrois.getText().toString();
                    }
                    if (varOrUn.matches(""))
                    {
                        orUn.setText("0");
                        varOrUn = orUn.getText().toString();
                    }
                    if (varArgentUn.matches(""))
                    {
                        argentUn.setText("0");
                        varArgentUn = argentUn.getText().toString();
                    }
                    if (varOrDeux.matches(""))
                    {
                        orDeux.setText("0");
                        varOrDeux = orDeux.getText().toString();
                    }
                    if (varArgentDeux.matches(""))
                    {
                        argentDeux.setText("0");
                        varArgentDeux = argentDeux.getText().toString();
                    }
                    if (varOrTrois.matches(""))
                    {
                        orTrois.setText("0");
                        varOrTrois = orTrois.getText().toString();
                    }
                    if (varArgentTrois.matches(""))
                    {
                        argentTrois.setText("0");
                        varArgentTrois = argentTrois.getText().toString();
                    }
                    if (varOrObjUn.matches(""))
                    {
                        orObjUn.setText("0");
                        varOrObjUn = orObjUn.getText().toString();
                    }
                    if (varArgObjUn.matches(""))
                    {
                        argObjUn.setText("0");
                        varArgObjUn = argObjUn.getText().toString();
                    }
                    if (varOrObjDeux.matches(""))
                    {
                        orObjDeux.setText("0");
                        varOrObjDeux = orObjDeux.getText().toString();
                    }
                    if (varArgObjDeux.matches(""))
                    {
                        argObjDeux.setText("0");
                        varArgObjDeux = argObjDeux.getText().toString();
                    }
                    if (varOrObjTrois.matches(""))
                    {
                        orObjTrois.setText("0");
                        varOrObjTrois = orObjTrois.getText().toString();
                    }
                    if (varArgObjTrois.matches(""))
                    {
                        argObjTrois.setText("0");
                        varArgObjTrois = argObjTrois.getText().toString();
                    }
                    if (varExpUn.matches(""))
                    {
                        expUn.setText("0");
                        varExpUn = expUn.getText().toString();
                    }
                    if (varExpDeux.matches(""))
                    {
                        expDeux.setText("0");
                        varExpDeux = expDeux.getText().toString();
                    }
                    if (varExpTrois.matches(""))
                    {
                        expTrois.setText("0");
                        varExpTrois = expTrois.getText().toString();
                    }

                    int varMinU = Integer.parseInt(varMinUn);
                    int varSecU = Integer.parseInt(varSecUn);
                    int varOrU = Integer.parseInt(varOrUn);
                    int varArgentU = Integer.parseInt(varArgentUn);
                    int varOrObjU = Integer.parseInt(varOrObjUn);
                    int varArgObjU = Integer.parseInt(varArgObjUn);
                    int varExpU = Integer.parseInt(varExpUn);
                    int varMinD = Integer.parseInt(varMinDeux);
                    int varSecD = Integer.parseInt(varSecDeux);
                    int varOrD = Integer.parseInt(varOrDeux);
                    int varArgentD = Integer.parseInt(varArgentDeux);
                    int varOrObjD = Integer.parseInt(varOrObjDeux);
                    int varArgObjD = Integer.parseInt(varArgObjDeux);
                    int varExpD = Integer.parseInt(varExpDeux);
                    int varMinT = Integer.parseInt(varMinTrois);
                    int varSecT = Integer.parseInt(varSecTrois);
                    int varOrT = Integer.parseInt(varOrTrois);
                    int varArgentT = Integer.parseInt(varArgentTrois);
                    int varOrObjT = Integer.parseInt(varOrObjTrois);
                    int varArgObjT = Integer.parseInt(varArgObjTrois);
                    int varExpT = Integer.parseInt(varExpTrois);
                    float resMoyExpU;
                    float resMoyExpD;
                    float resMoyExpT;
                    float resMoyOrU;
                    float resMoyOrD;
                    float resMoyOrT;

                    resMoyExpU = moyenneExp(varMinU, varSecU, varExpU);
                    resMoyExpD = moyenneExp(varMinD, varSecD, varExpD);
                    resMoyExpT = moyenneExp(varMinT, varSecT, varExpT);
                    showMoyExp(resMoyExpU, resMoyExpD, resMoyExpT);
                    resMoyOrU = moyenneOr(varMinU, varSecU, varOrU, varArgentU, varOrObjU, varArgObjU);
                    resMoyOrD = moyenneOr(varMinD, varSecD, varOrD, varArgentD, varOrObjD, varArgObjD);
                    resMoyOrT = moyenneOr(varMinT, varSecT, varOrT, varArgentT, varOrObjT, varArgObjT);
                    showMoyOr(resMoyOrU, resMoyOrD, resMoyOrT);
                }
                break;

            case R.id.buttonReset:
                minUn.setText("");
                secUn.setText("");
                orUn.setText("");
                argentUn.setText("");
                orObjUn.setText("");
                argObjUn.setText("");
                expUn.setText("");
                minDeux.setText("");
                secDeux.setText("");
                orDeux.setText("");
                argentDeux.setText("");
                orObjDeux.setText("");
                argObjDeux.setText("");
                expDeux.setText("");
                minTrois.setText("");
                secTrois.setText("");
                orTrois.setText("");
                argentTrois.setText("");
                orObjTrois.setText("");
                argObjTrois.setText("");
                expTrois.setText("");
                mExpUn.setVisibility(View.INVISIBLE);
                mExpDeux.setVisibility(View.INVISIBLE);
                mExpTrois.setVisibility(View.INVISIBLE);
                rentUn.setVisibility(View.INVISIBLE);
                rentDeux.setVisibility(View.INVISIBLE);
                rentTrois.setVisibility(View.INVISIBLE);
                break;
        }
    }

    public float moyenneExp(int min, int sec, int exp)
    {
        float resultat;
        int temps;

        temps = (min*60) + sec;
        resultat = (float)exp/temps;

        return resultat;
    }

    public float moyenneOr(int min, int sec, int or, int arg, int orObj, int argObj)
    {
        float resultat;
        int temps;
        int centaineA;
        int centaineO;

        centaineA = (int) (0.01*arg);
        centaineO = (int) (0.01*argObj);
        temps = (min*60) + sec;
        resultat = (float)((or + centaineA) + (arg - centaineA*100) + (orObj + centaineO) + (argObj - centaineO*100))/temps;
        return resultat;
    }

    public void showMoyExp(float resU, float resD, float resT)
    {
        if (resU >= resD && resU >= resT)
        {
            if (resU == resD && resU > resT)
            {
                mExpUn.setVisibility(View.VISIBLE);
                mExpDeux.setVisibility(View.VISIBLE);
            }
            else if (resU == resT && resU > resD)
            {
                mExpUn.setVisibility(View.VISIBLE);
                mExpTrois.setVisibility(View.VISIBLE);
            }
            else if (resU == resD && resU == resT)
            {
                mExpUn.setVisibility(View.VISIBLE);
                mExpDeux.setVisibility(View.VISIBLE);
                mExpTrois.setVisibility(View.VISIBLE);
            }
            else
            {
                mExpUn.setVisibility(View.VISIBLE);
            }
        }
        else if (resD > resU && resD >= resT)
        {
            if (resD == resT)
            {
                mExpDeux.setVisibility(View.VISIBLE);
                mExpTrois.setVisibility(View.VISIBLE);
            }
            else
            {
                mExpDeux.setVisibility(View.VISIBLE);
            }
        }
        else if (resT > resU && resT > resD)
        {
            mExpTrois.setVisibility(View.VISIBLE);
        }
        else
        {
            return ;
        }
    }

    public void showMoyOr (float resU, float resD, float resT)
    {
        if (resU >= resD && resU >= resT)
        {
            if (resU == resD && resU > resT)
            {
                rentUn.setVisibility(View.VISIBLE);
                rentDeux.setVisibility(View.VISIBLE);
            }
            else if (resU == resT && resU > resD)
            {
                rentUn.setVisibility(View.VISIBLE);
                rentTrois.setVisibility(View.VISIBLE);
            }
            else if (resU == resD && resU == resT)
            {
                rentUn.setVisibility(View.VISIBLE);
                rentDeux.setVisibility(View.VISIBLE);
                rentTrois.setVisibility(View.VISIBLE);
            }
            else
            {
                rentUn.setVisibility(View.VISIBLE);
            }
        }
        else if (resD > resU && resD >= resT)
        {
            if (resD == resT)
            {
                rentDeux.setVisibility(View.VISIBLE);
                rentTrois.setVisibility(View.VISIBLE);
            }
            else
            {
                rentDeux.setVisibility(View.VISIBLE);
            }
        }
        else if (resT > resU && resT > resD)
        {
            rentTrois.setVisibility(View.VISIBLE);
        }
        else
        {
            return ;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}