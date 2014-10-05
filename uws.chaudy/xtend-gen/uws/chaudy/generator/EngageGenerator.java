package uws.chaudy.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uws.chaudy.engage.Action;
import uws.chaudy.engage.ActionReaction;
import uws.chaudy.engage.Age;
import uws.chaudy.engage.Characteristic;
import uws.chaudy.engage.EvidenceModel;
import uws.chaudy.engage.Feedback;
import uws.chaudy.engage.FeedbackMessages;
import uws.chaudy.engage.FeedbackModel;
import uws.chaudy.engage.GameDescription;
import uws.chaudy.engage.InactivityLimit;
import uws.chaudy.engage.LearningOutcomes;
import uws.chaudy.engage.Model;
import uws.chaudy.engage.Outcome;
import uws.chaudy.engage.OutcomeValueLimit;
import uws.chaudy.engage.Parameter;
import uws.chaudy.engage.Params;
import uws.chaudy.engage.PlayerDescription;
import uws.chaudy.engage.Point;
import uws.chaudy.engage.Points;
import uws.chaudy.engage.PointsCondition;
import uws.chaudy.engage.Reaction;
import uws.chaudy.engage.Reactions;
import uws.chaudy.engage.Trigger;
import uws.chaudy.engage.TriggerFeedback;
import uws.chaudy.engage.Type;

@SuppressWarnings("all")
public class EngageGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    CharSequence _jsonCode = this.toJsonCode(((Model) _head));
    fsa.generateFile("DSL.json", _jsonCode);
  }
  
  public CharSequence toJsonCode(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    GameDescription _game = model.getGame();
    CharSequence _compile = this.compile(_game);
    _builder.append(_compile, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      PlayerDescription _player = model.getPlayer();
      boolean _notEquals = (!Objects.equal(_player, null));
      if (_notEquals) {
        PlayerDescription _player_1 = model.getPlayer();
        CharSequence _compile_1 = this.compile(_player_1);
        _builder.append(_compile_1, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    LearningOutcomes _learningOutcomes = model.getLearningOutcomes();
    CharSequence _compile_2 = this.compile(_learningOutcomes, model);
    _builder.append(_compile_2, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      FeedbackMessages _feedbackMessages = model.getFeedbackMessages();
      boolean _notEquals_1 = (!Objects.equal(_feedbackMessages, null));
      if (_notEquals_1) {
        FeedbackMessages _feedbackMessages_1 = model.getFeedbackMessages();
        CharSequence _compile_3 = this.compile(_feedbackMessages_1);
        _builder.append(_compile_3, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EvidenceModel _evidenceModel = model.getEvidenceModel();
    CharSequence _compile_4 = this.compile(_evidenceModel, model);
    _builder.append(_compile_4, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      FeedbackModel _feedbackModel = model.getFeedbackModel();
      boolean _notEquals_2 = (!Objects.equal(_feedbackModel, null));
      if (_notEquals_2) {
        FeedbackModel _feedbackModel_1 = model.getFeedbackModel();
        CharSequence _compile_5 = this.compile(_feedbackModel_1);
        _builder.append(_compile_5, "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final GameDescription sg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"seriousGame\" : {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"name\" : \"");
    String _name = sg.getName();
    _builder.append(_name, "	");
    _builder.append("\"");
    {
      String _desc = sg.getDesc();
      boolean _notEquals = (!Objects.equal(_desc, null));
      if (_notEquals) {
        _builder.append(" ,");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"description\" : \"");
        String _desc_1 = sg.getDesc();
        _builder.append(_desc_1, "	");
        _builder.append("\"");
      }
    }
    {
      Age _ageRange = sg.getAgeRange();
      boolean _notEquals_1 = (!Objects.equal(_ageRange, null));
      if (_notEquals_1) {
        _builder.append(", ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"ageMin\" : ");
        Age _ageRange_1 = sg.getAgeRange();
        int _ageMin = _ageRange_1.getAgeMin();
        _builder.append(_ageMin, "	");
        _builder.append(" , ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"ageMax\" : ");
        Age _ageRange_2 = sg.getAgeRange();
        int _ageMax = _ageRange_2.getAgeMax();
        _builder.append(_ageMax, "	");
        _builder.append(" ");
      }
    }
    {
      String _lang = sg.getLang();
      boolean _notEquals_2 = (!Objects.equal(_lang, null));
      if (_notEquals_2) {
        _builder.append(", ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"lang\" : \"");
        String _lang_1 = sg.getLang();
        _builder.append(_lang_1, "	");
        _builder.append("\" ");
      }
    }
    {
      String _country = sg.getCountry();
      boolean _notEquals_3 = (!Objects.equal(_country, null));
      if (_notEquals_3) {
        _builder.append(", ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"country\" : \"");
        String _country_1 = sg.getCountry();
        _builder.append(_country_1, "	");
        _builder.append("\" ");
      }
    }
    {
      String _genre = sg.getGenre();
      boolean _notEquals_4 = (!Objects.equal(_genre, null));
      if (_notEquals_4) {
        _builder.append(", ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"genre\" : \"");
        String _genre_1 = sg.getGenre();
        _builder.append(_genre_1, "	");
        _builder.append("\" ");
      }
    }
    {
      String _subject = sg.getSubject();
      boolean _notEquals_5 = (!Objects.equal(_subject, null));
      if (_notEquals_5) {
        _builder.append(", ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"subject\" : \"");
        String _subject_1 = sg.getSubject();
        _builder.append(_subject_1, "	");
        _builder.append("\" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("},");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final PlayerDescription player) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"player\" : [    \t");
    _builder.newLine();
    {
      EList<Characteristic> _characteristics = player.getCharacteristics();
      for(final Characteristic c : _characteristics) {
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\"name\" : \"");
        String _name = c.getName();
        _builder.append(_name, "	");
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"type\" : \"");
        {
          Type _type = c.getType();
          String _simpleType = _type.getSimpleType();
          boolean _notEquals = (!Objects.equal(_simpleType, null));
          if (_notEquals) {
            Type _type_1 = c.getType();
            String _simpleType_1 = _type_1.getSimpleType();
            _builder.append(_simpleType_1, "	");
          } else {
            Type _type_2 = c.getType();
            uws.chaudy.engage.Enum _enumType = _type_2.getEnumType();
            String _string = _enumType.toString();
            _builder.append(_string, "	");
          }
        }
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        {
          EList<Characteristic> _characteristics_1 = player.getCharacteristics();
          Characteristic _last = IterableExtensions.<Characteristic>last(_characteristics_1);
          boolean _notEquals_1 = (!Objects.equal(_last, c));
          if (_notEquals_1) {
            _builder.append(", ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("],");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final LearningOutcomes los, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"learningOutcomes\" : {");
    _builder.newLine();
    {
      EList<Outcome> _outcomes = los.getOutcomes();
      for(final Outcome lo : _outcomes) {
        _builder.append("\"");
        String _name = lo.getName();
        _builder.append(_name, "");
        _builder.append("\" : {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          String _desc = lo.getDesc();
          boolean _notEquals = (!Objects.equal(_desc, null));
          if (_notEquals) {
            _builder.append("\"desc\" : \"");
            String _desc_1 = lo.getDesc();
            _builder.append(_desc_1, "	");
            _builder.append("\" ");
          }
        }
        _builder.append(", ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"value\" : ");
        int _value = lo.getValue();
        _builder.append(_value, "	");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"feedbackTriggered\" : [");
        _builder.newLine();
        {
          FeedbackModel _feedbackModel = model.getFeedbackModel();
          EList<Trigger> _triggers = _feedbackModel.getTriggers();
          for(final Trigger f : _triggers) {
            {
              OutcomeValueLimit _perf = f.getPerf();
              boolean _notEquals_1 = (!Objects.equal(_perf, null));
              if (_notEquals_1) {
                {
                  OutcomeValueLimit _perf_1 = f.getPerf();
                  Outcome _outcome = _perf_1.getOutcome();
                  boolean _equals = Objects.equal(_outcome, lo);
                  if (_equals) {
                    _builder.append("\t");
                    _builder.append("{");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\"limit\" : ");
                    {
                      OutcomeValueLimit _perf_2 = f.getPerf();
                      boolean _isNegativeLimit = _perf_2.isNegativeLimit();
                      if (_isNegativeLimit) {
                        _builder.append("-");
                      }
                    }
                    OutcomeValueLimit _perf_3 = f.getPerf();
                    int _limit = _perf_3.getLimit();
                    _builder.append(_limit, "		");
                    _builder.append(",");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\"sign\" : \"");
                    OutcomeValueLimit _perf_4 = f.getPerf();
                    String _sign = _perf_4.getSign();
                    _builder.append(_sign, "		");
                    _builder.append("\",");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\"feedback\" :  [\"");
                    {
                      OutcomeValueLimit _perf_5 = f.getPerf();
                      EList<TriggerFeedback> _triggerReactions = _perf_5.getTriggerReactions();
                      for(final TriggerFeedback t : _triggerReactions) {
                        Feedback _feedback = t.getFeedback();
                        String _name_1 = _feedback.getName();
                        _builder.append(_name_1, "		");
                      }
                    }
                    _builder.append("\"]");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("}");
                    {
                      FeedbackModel _feedbackModel_1 = model.getFeedbackModel();
                      EList<Trigger> _triggers_1 = _feedbackModel_1.getTriggers();
                      Trigger _last = IterableExtensions.<Trigger>last(_triggers_1);
                      boolean _notEquals_2 = (!Objects.equal(_last, f));
                      if (_notEquals_2) {
                        _builder.append(", ");
                      }
                    }
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("]");
        _builder.newLine();
        _builder.append("}");
        {
          EList<Outcome> _outcomes_1 = los.getOutcomes();
          Outcome _last_1 = IterableExtensions.<Outcome>last(_outcomes_1);
          boolean _notEquals_3 = (!Objects.equal(_last_1, lo));
          if (_notEquals_3) {
            _builder.append(", ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("},");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final FeedbackMessages feedback) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"feedback\" : [");
    _builder.newLine();
    {
      EList<Feedback> _feedbackMsgs = feedback.getFeedbackMsgs();
      for(final Feedback f : _feedbackMsgs) {
        _builder.append("\t");
        _builder.append("\"");
        String _name = f.getName();
        _builder.append(_name, "	");
        _builder.append("\" : {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("\"message\" : \"");
        String _message = f.getMessage();
        _builder.append(_message, "		");
        _builder.append("\"");
        {
          String _type = f.getType();
          boolean _notEquals = (!Objects.equal(_type, null));
          if (_notEquals) {
            _builder.append(", ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"type\" : \"");
            String _type_1 = f.getType();
            _builder.append(_type_1, "		");
            _builder.append("\"");
          }
        }
        {
          boolean _isFinal = f.isFinal();
          if (_isFinal) {
            _builder.append(", ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"final\" : \"true\"");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        {
          EList<Feedback> _feedbackMsgs_1 = feedback.getFeedbackMsgs();
          Feedback _last = IterableExtensions.<Feedback>last(_feedbackMsgs_1);
          boolean _notEquals_1 = (!Objects.equal(_last, f));
          if (_notEquals_1) {
            _builder.append(", ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("],");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final EvidenceModel actions, final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"evidenceModel\" : [");
    _builder.newLine();
    {
      EList<Action> _actions = actions.getActions();
      for(final Action a : _actions) {
        {
          EList<Points> _points = a.getPoints();
          for(final Points assessment : _points) {
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"action\" : \"");
            String _name = a.getName();
            _builder.append(_name, "		");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"params\" : {");
            _builder.newLine();
            {
              EList<Parameter> _params = a.getParams();
              for(final Parameter p : _params) {
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append("\"");
                String _name_1 = p.getName();
                _builder.append(_name_1, "			");
                _builder.append("\" : \"");
                {
                  Type _type = p.getType();
                  String _simpleType = _type.getSimpleType();
                  boolean _notEquals = (!Objects.equal(_simpleType, null));
                  if (_notEquals) {
                    Type _type_1 = p.getType();
                    String _simpleType_1 = _type_1.getSimpleType();
                    _builder.append(_simpleType_1, "			");
                  } else {
                    Type _type_2 = p.getType();
                    uws.chaudy.engage.Enum _enumType = _type_2.getEnumType();
                    String _string = _enumType.toString();
                    _builder.append(_string, "			");
                  }
                }
                _builder.append("\"");
                {
                  EList<Parameter> _params_1 = a.getParams();
                  Parameter _last = IterableExtensions.<Parameter>last(_params_1);
                  boolean _notEquals_1 = (!Objects.equal(_last, p));
                  if (_notEquals_1) {
                    _builder.append(", ");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("},");
            _builder.newLine();
            {
              boolean _isOthers = assessment.isOthers();
              if (_isOthers) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\"else\" : \"true\",");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\"values\" : [");
                _builder.newLine();
                {
                  EList<Params> _params_2 = assessment.getParams();
                  for(final Params p_1 : _params_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("{");
                    _builder.newLine();
                    {
                      EList<String> _values = p_1.getValues();
                      for(final String value : _values) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("\"");
                        EList<Parameter> _params_3 = a.getParams();
                        EList<String> _values_1 = p_1.getValues();
                        int _indexOf = _values_1.indexOf(value);
                        Parameter _get = _params_3.get(_indexOf);
                        String _name_2 = _get.getName();
                        _builder.append(_name_2, "				");
                        _builder.append("\" : ");
                        {
                          boolean _and = false;
                          EList<Parameter> _params_4 = a.getParams();
                          EList<String> _values_2 = p_1.getValues();
                          int _indexOf_1 = _values_2.indexOf(value);
                          Parameter _get_1 = _params_4.get(_indexOf_1);
                          Type _type_3 = _get_1.getType();
                          String _simpleType_2 = _type_3.getSimpleType();
                          boolean _notEquals_2 = (!Objects.equal(_simpleType_2, null));
                          if (!_notEquals_2) {
                            _and = false;
                          } else {
                            boolean _or = false;
                            EList<Parameter> _params_5 = a.getParams();
                            EList<String> _values_3 = p_1.getValues();
                            int _indexOf_2 = _values_3.indexOf(value);
                            Parameter _get_2 = _params_5.get(_indexOf_2);
                            Type _type_4 = _get_2.getType();
                            String _simpleType_3 = _type_4.getSimpleType();
                            boolean _equals = Objects.equal(_simpleType_3, "Int");
                            if (_equals) {
                              _or = true;
                            } else {
                              EList<Parameter> _params_6 = a.getParams();
                              EList<String> _values_4 = p_1.getValues();
                              int _indexOf_3 = _values_4.indexOf(value);
                              Parameter _get_3 = _params_6.get(_indexOf_3);
                              Type _type_5 = _get_3.getType();
                              String _simpleType_4 = _type_5.getSimpleType();
                              boolean _equals_1 = Objects.equal(_simpleType_4, "Float");
                              _or = (_equals || _equals_1);
                            }
                            _and = (_notEquals_2 && _or);
                          }
                          if (_and) {
                            _builder.append(value, "				");
                          } else {
                            _builder.append("\"");
                            _builder.append(value, "				");
                            _builder.append("\"");
                          }
                        }
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("}");
                    {
                      EList<Params> _params_7 = assessment.getParams();
                      Params _last_1 = IterableExtensions.<Params>last(_params_7);
                      boolean _notEquals_3 = (!Objects.equal(_last_1, p_1));
                      if (_notEquals_3) {
                        _builder.append(", ");
                      }
                    }
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("],");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"mark\" : {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\"learningOutcome\" : \"");
            {
              Outcome _outcome = assessment.getOutcome();
              boolean _notEquals_4 = (!Objects.equal(_outcome, null));
              if (_notEquals_4) {
                Outcome _outcome_1 = assessment.getOutcome();
                String _name_3 = _outcome_1.getName();
                _builder.append(_name_3, "			");
              } else {
                LearningOutcomes _learningOutcomes = model.getLearningOutcomes();
                EList<Outcome> _outcomes = _learningOutcomes.getOutcomes();
                Outcome _get_4 = _outcomes.get(0);
                String _name_4 = _get_4.getName();
                _builder.append(_name_4, "			");
              }
            }
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\"mark\" : ");
            {
              Point _pts = assessment.getPts();
              boolean _isNegative = _pts.isNegative();
              if (_isNegative) {
                _builder.append("-");
              }
            }
            Point _pts_1 = assessment.getPts();
            int _value = _pts_1.getValue();
            _builder.append(_value, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("},");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"feedback\" : [");
            _builder.newLine();
            {
              Reactions _reactions = a.getReactions();
              boolean _notEquals_5 = (!Objects.equal(_reactions, null));
              if (_notEquals_5) {
                {
                  Reactions _reactions_1 = a.getReactions();
                  EList<Reaction> _reaction = _reactions_1.getReaction();
                  for(final Reaction r : _reaction) {
                    {
                      boolean _and_1 = false;
                      PointsCondition _pointsC = r.getPointsC();
                      boolean _notEquals_6 = (!Objects.equal(_pointsC, null));
                      if (!_notEquals_6) {
                        _and_1 = false;
                      } else {
                        PointsCondition _pointsC_1 = r.getPointsC();
                        String _keyWd = _pointsC_1.getKeyWd();
                        boolean _equals_2 = Objects.equal(_keyWd, "any");
                        _and_1 = (_notEquals_6 && _equals_2);
                      }
                      if (_and_1) {
                        {
                          PointsCondition _pointsC_2 = r.getPointsC();
                          String _sign = _pointsC_2.getSign();
                          boolean _notEquals_7 = (!Objects.equal(_sign, null));
                          if (_notEquals_7) {
                            {
                              boolean _or_1 = false;
                              boolean _and_2 = false;
                              PointsCondition _pointsC_3 = r.getPointsC();
                              String _sign_1 = _pointsC_3.getSign();
                              boolean _equals_3 = Objects.equal(_sign_1, "+");
                              if (!_equals_3) {
                                _and_2 = false;
                              } else {
                                Point _pts_2 = assessment.getPts();
                                boolean _isNegative_1 = _pts_2.isNegative();
                                boolean _not = (!_isNegative_1);
                                _and_2 = (_equals_3 && _not);
                              }
                              if (_and_2) {
                                _or_1 = true;
                              } else {
                                boolean _and_3 = false;
                                PointsCondition _pointsC_4 = r.getPointsC();
                                String _sign_2 = _pointsC_4.getSign();
                                boolean _equals_4 = Objects.equal(_sign_2, "-");
                                if (!_equals_4) {
                                  _and_3 = false;
                                } else {
                                  Point _pts_3 = assessment.getPts();
                                  boolean _isNegative_2 = _pts_3.isNegative();
                                  _and_3 = (_equals_4 && _isNegative_2);
                                }
                                _or_1 = (_and_2 || _and_3);
                              }
                              if (_or_1) {
                                _builder.append("\t");
                                _builder.append("\t");
                                _builder.append("\"");
                                Feedback _feedback = r.getFeedback();
                                String _name_5 = _feedback.getName();
                                _builder.append(_name_5, "		");
                                _builder.append("\"");
                                {
                                  Reactions _reactions_2 = a.getReactions();
                                  EList<Reaction> _reaction_1 = _reactions_2.getReaction();
                                  Reaction _last_2 = IterableExtensions.<Reaction>last(_reaction_1);
                                  boolean _notEquals_8 = (!Objects.equal(_last_2, r));
                                  if (_notEquals_8) {
                                    _builder.append(", ");
                                  }
                                }
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          } else {
                            {
                              PointsCondition _pointsC_5 = r.getPointsC();
                              Point _value_1 = _pointsC_5.getValue();
                              Point _pts_4 = assessment.getPts();
                              boolean _equals_5 = Objects.equal(_value_1, _pts_4);
                              if (_equals_5) {
                                _builder.append("\t");
                                _builder.append("\t");
                                _builder.append("\"");
                                Feedback _feedback_1 = r.getFeedback();
                                String _name_6 = _feedback_1.getName();
                                _builder.append(_name_6, "		");
                                _builder.append("\"");
                                {
                                  Reactions _reactions_3 = a.getReactions();
                                  EList<Reaction> _reaction_2 = _reactions_3.getReaction();
                                  Reaction _last_3 = IterableExtensions.<Reaction>last(_reaction_2);
                                  boolean _notEquals_9 = (!Objects.equal(_last_3, r));
                                  if (_notEquals_9) {
                                    _builder.append(", ");
                                  }
                                }
                                _builder.newLineIfNotEmpty();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("]");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            {
              boolean _and_4 = false;
              EList<Points> _points_1 = a.getPoints();
              Points _last_4 = IterableExtensions.<Points>last(_points_1);
              boolean _notEquals_10 = (!Objects.equal(_last_4, assessment));
              if (!_notEquals_10) {
                _and_4 = false;
              } else {
                EList<Action> _actions_1 = actions.getActions();
                Action _last_5 = IterableExtensions.<Action>last(_actions_1);
                boolean _notEquals_11 = (!Objects.equal(_last_5, a));
                _and_4 = (_notEquals_10 && _notEquals_11);
              }
              if (_and_4) {
                _builder.append(", ");
              }
            }
            _builder.append("\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("]");
    {
      FeedbackModel _feedbackModel = model.getFeedbackModel();
      boolean _notEquals_12 = (!Objects.equal(_feedbackModel, null));
      if (_notEquals_12) {
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final FeedbackModel feedbackModel) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"inactivityFeedback\" : [");
    _builder.newLine();
    {
      EList<Trigger> _triggers = feedbackModel.getTriggers();
      for(final Trigger i : _triggers) {
        {
          InactivityLimit _inactivity = i.getInactivity();
          boolean _notEquals = (!Objects.equal(_inactivity, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"limit\" : ");
            InactivityLimit _inactivity_1 = i.getInactivity();
            int _limit = _inactivity_1.getLimit();
            _builder.append(_limit, "		");
            _builder.append(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"sign\" : \"");
            InactivityLimit _inactivity_2 = i.getInactivity();
            String _sign = _inactivity_2.getSign();
            _builder.append(_sign, "		");
            _builder.append("\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\"feedback\" : [");
            {
              InactivityLimit _inactivity_3 = i.getInactivity();
              EList<ActionReaction> _triggerReactions = _inactivity_3.getTriggerReactions();
              for(final ActionReaction t : _triggerReactions) {
                {
                  TriggerFeedback _triggerFeedback = t.getTriggerFeedback();
                  boolean _notEquals_1 = (!Objects.equal(_triggerFeedback, null));
                  if (_notEquals_1) {
                    _builder.append(" ");
                    TriggerFeedback _triggerFeedback_1 = t.getTriggerFeedback();
                    Feedback _feedback = _triggerFeedback_1.getFeedback();
                    String _name = _feedback.getName();
                    _builder.append(_name, "		");
                    _builder.append(" ");
                  }
                }
              }
            }
            _builder.append("]");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            {
              EList<Trigger> _triggers_1 = feedbackModel.getTriggers();
              Trigger _last = IterableExtensions.<Trigger>last(_triggers_1);
              boolean _notEquals_2 = (!Objects.equal(_last, i));
              if (_notEquals_2) {
                _builder.append(", ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("]");
    _builder.newLine();
    return _builder;
  }
}
